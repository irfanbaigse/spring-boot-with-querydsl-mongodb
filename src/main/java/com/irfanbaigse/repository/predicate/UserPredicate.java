package com.irfanbaigse.repository.predicate;

import com.irfanbaigse.repository.entity.QUser;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;

/**
 * @author Baig
 * 2021-04-25 at 11:13 PM
 * <p>
 * Copyright @ 2021 Seera. All rights reserved.
 * @see <a href="https://www.seera.sa">https://www.seera.sa</a>
 */
public class UserPredicate implements QuerydslBinderCustomizer<QUser> {
    @Override
    public void customize(QuerydslBindings querydslBindings, QUser qUser) {

    }
}
