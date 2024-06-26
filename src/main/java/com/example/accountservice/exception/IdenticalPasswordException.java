package com.example.accountservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "The passwords must be different!")
public class IdenticalPasswordException extends RuntimeException {
    public IdenticalPasswordException() {
        super();
    }
}
