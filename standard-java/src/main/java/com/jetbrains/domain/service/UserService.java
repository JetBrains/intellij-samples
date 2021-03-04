package com.jetbrains.domain.service;

import com.jetbrains.domain.repository.UserRepository;

@SuppressWarnings({"unused", "ClassCanBeRecord"})
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
