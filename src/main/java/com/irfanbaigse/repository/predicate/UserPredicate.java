package com.irfanbaigse.repository.predicate;

import com.irfanbaigse.repository.entity.QUser;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.EnumExpression;
import com.querydsl.core.types.dsl.StringExpression;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

import java.time.LocalTime;

public class UserPredicate implements QuerydslBinderCustomizer<QUser> {
    @Override
    public void customize(QuerydslBindings querydslBindings, QUser qUser) {

        // String
        querydslBindings.bind(qUser.fullName)
                .as("name")
                .first(StringExpression::eq);

        // Enum
        querydslBindings.bind(qUser.type)
                .as("type")
                .first(EnumExpression::eq);

        querydslBindings.bind(qUser.cities)
                .as("city-id")
                .first((path, integers) -> path.any().in(integers));

        querydslBindings.bind(qUser.registerDate)
                .as("register-date")
                .first((path, value) -> path.goe(value));


        querydslBindings.bind(qUser.active).as("active").first(BooleanExpression::eq);

//        new QUser("ss").fullName.eq("anything");

        querydslBindings.bind(qUser.creationDateFrom)
                .as("created-from")
                .first((path, value) -> qUser.createdAt.goe(value.atStartOfDay()));
        querydslBindings.bind(qUser.creationDateTo)
                .as("created-to")
                .first((path, value) ->qUser.createdAt.loe(value.atTime(LocalTime.MAX)));

    }
}
