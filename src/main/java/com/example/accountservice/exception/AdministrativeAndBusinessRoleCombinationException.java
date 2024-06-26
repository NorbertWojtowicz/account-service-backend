package com.example.accountservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "The user cannot combine administrative and business roles!")
public class AdministrativeAndBusinessRoleCombinationException extends RuntimeException {
    public AdministrativeAndBusinessRoleCombinationException() {
        super();
    }
}
