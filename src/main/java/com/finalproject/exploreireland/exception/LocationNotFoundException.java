package com.finalproject.exploreireland.exception;

public class LocationNotFoundException extends RuntimeException{

    /**
     * Location not found exception method
     * @param message
     */
    public LocationNotFoundException(String message) {

        super(message);
    }
}
