package com.jetbrains.domain.repository;

public class UserRepository {
    // does data access. This should only access the database.
    // try adding a dependency on com.jetbrains.domain.ui.UserModel, and see the dependencies inspection give a warning

    com.jetbrains.domain.ui.UserModel userModel;
}
