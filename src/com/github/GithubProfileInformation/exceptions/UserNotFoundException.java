package com.github.GithubProfileInformation.exceptions;

public class UserNotFoundException extends RuntimeException {
    private String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}