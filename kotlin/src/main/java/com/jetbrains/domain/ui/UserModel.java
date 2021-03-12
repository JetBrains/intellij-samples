package com.jetbrains.domain.ui;

import com.jetbrains.domain.service.UserService;

@SuppressWarnings({"unused", "ClassCanBeRecord", "FieldCanBeLocal"})
public class UserModel {
    private final UserService userService;

    public UserModel(UserService userService) {
        this.userService = userService;
    }
}
