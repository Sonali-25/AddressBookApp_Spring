package com.example.addressbook_spring.dto;

public class AddressBookDTO {
    public String name;
    public String state;
    public String city;
    public String address;
    public long phoneNumber;
    public long zipCode;


    public AddressBookDTO(String name, String state, String city, String address, long phoneNumber, long zipCode) {
        this.name = name;
        this.address = address;
        this.state = state;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZipCode() {
        return zipCode;
    }

    public void setZipCode(long zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return "AddressBookDTO{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", city=" + city +
                ", state=" + state +
                ", zipcode=" + zipCode +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
