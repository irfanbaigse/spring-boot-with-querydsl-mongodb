package com.irfanbaigse.controller;

import com.irfanbaigse.repository.entity.User;
import com.irfanbaigse.repository.predicate.UserPredicate;
import com.irfanbaigse.service.UserService;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.web.PageableDefault;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<Page<User>> getUsers(@QuerydslPredicate(root = User.class, bindings = UserPredicate.class) Predicate predicate,
                                               @PageableDefault(page = 0, size = 10)
                           @SortDefault.SortDefaults({
                                   @SortDefault(sort = "updated_at", direction = Sort.Direction.DESC),
                           }) Pageable pageable) {

        Page<User> all= this.userService.getAllUsers(pageable, predicate);

        return ResponseEntity.ok(all);
    }
}
