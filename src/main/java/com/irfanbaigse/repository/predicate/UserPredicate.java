package com.irfanbaigse.repository.predicate;

import com.irfanbaigse.repository.entity.QUser;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

public class UserPredicate implements QuerydslBinderCustomizer<QUser> {
    @Override
    public void customize(QuerydslBindings querydslBindings, QUser qUser) {

    }
}
