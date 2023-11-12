package com.example.demo.domain.exceptions;

public class UserNotFoundException extends RuntimeException{
        public UserNotFoundException(String username) {
                super("User with ID " + username + " not found.");
            }
}
