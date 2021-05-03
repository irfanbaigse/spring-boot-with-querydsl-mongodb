package com.irfanbaigse.repository;

/**
 * @author Baig
 * 2021-05-03 at 11:44 PM
 * <p>
 * Copyright @ 2021 Seera. All rights reserved.
 * @see <a href="https://www.seera.sa">https://www.seera.sa</a>
 */
public enum UserTypeE {
    CUSTOMER("customer"),
    VENDOR("vendor");

    private String type;

    UserTypeE(String type) {
        this.type = type;
    }
}
