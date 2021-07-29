package com.example.addressbook_spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressBookDTO {
    @Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$",
            message = "Employee First Name Invalid")
    public String name;

    @Pattern(regexp = "^[A-Z]{1}[a-z A-Z\\s]{2,}$",
            message = "Address cannot be empty")
    public String address;

}
