package com.irfanbaigse.repository;

import com.irfanbaigse.repository.entity.User;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User>, QuerydslPredicateExecutor<User> {

}
