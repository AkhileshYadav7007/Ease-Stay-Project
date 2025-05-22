package com.easestay.EaseStay.Exception;

public class OurException extends RuntimeException {
    //this class basically represents the custom exception to a user and show the error message

    public OurException(String message) {
        super(message);
    }
}