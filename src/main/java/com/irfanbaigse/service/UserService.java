package com.irfanbaigse.service;

import com.irfanbaigse.repository.entity.User;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> getAllUsers(Pageable pageable, Predicate predicate);
}
