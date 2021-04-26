package com.irfanbaigse.service.impl;

import com.irfanbaigse.repository.UserRepository;
import com.irfanbaigse.repository.entity.User;
import com.irfanbaigse.service.UserService;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Page<User> getAllUsers(Pageable pageable, Predicate predicate) {

        Page<User> all = this.userRepository.findAll(predicate, pageable);

        return all;
    }
}
