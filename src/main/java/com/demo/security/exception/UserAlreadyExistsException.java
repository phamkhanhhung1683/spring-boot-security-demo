package com.demo.security.exception;

import org.springframework.http.HttpStatus;

public class UserAlreadyExistsException extends BaseException {
    public UserAlreadyExistsException() {
        super(HttpStatus.CONFLICT);
    }
}
