package com.riwi.class_online.util.exceptions;

public class BadRequestException extends RuntimeException {
    public BadRequestException(String message){
        super(message);
    }
}
