package com.example.addressbook_spring.dto;



import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$", message = "Employee First Name Invalid")
    public String name;

    @NotBlank(message = "Address cannot be null")
    public String address;

    @NotBlank(message = "City cannot be null")
    public String city;

    @NotBlank(message = "State cannot be null")
    public String state;

    @NotNull(message = "Zipcode cannot be null")
    public int zipcode;

    @Pattern(regexp = "^[+]{0,1}[0-9]{2}\\s{0,1}[1-9]{1}[0-9]{9}$", message = "PhoneNumber Invalid")
    public String phoneNumber;


}
