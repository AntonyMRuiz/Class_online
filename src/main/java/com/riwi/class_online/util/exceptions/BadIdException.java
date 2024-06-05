package com.riwi.class_online.util.exceptions;

public class BadIdException extends RuntimeException {
    public BadIdException(String name) {
        super(name);
    }
}