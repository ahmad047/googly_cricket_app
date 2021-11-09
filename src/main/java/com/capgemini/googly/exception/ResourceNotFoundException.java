package com.capgemini.googly.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("Error 404 - %s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }
}
