package com.example.addressbook_spring.exceptions;

public class AddressBookException extends RuntimeException{
    public AddressBookException(String message) {
        super(message);
    }
}
