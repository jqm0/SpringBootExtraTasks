package com.example.Chocolate_Manufacturing_Factory.Service;

public class productNotFoundException extends RuntimeException {
    public productNotFoundException(String message) {
        super(message);
    }
}
