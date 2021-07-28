package com.example.addressbook_spring.model;

import com.example.addressbook_spring.dto.AddressBookDTO;

public class AddressBookData {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public AddressBookData() {

    }
    public AddressBookData(int id, AddressBookDTO addressbookDTO) {
        this.id = id;
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.address = addressbookDTO.address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
