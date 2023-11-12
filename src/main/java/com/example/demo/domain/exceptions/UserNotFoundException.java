package com.example.demo.domain.exceptions;

public class UserNotFoundException {
        public UserNotFoundException(Long userId) {
                super("User with ID " + userId + " not found.");
            }
}
