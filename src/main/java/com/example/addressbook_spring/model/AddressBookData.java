package com.example.addressbook_spring.model;

import com.example.addressbook_spring.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class AddressBookData {
    private int id;
    private String firstName;
    private String lastName;
    private String address;

    public AddressBookData(int id, AddressBookDTO addressbookDTO) {
        this.id = id;
        this.firstName = addressbookDTO.firstName;
        this.lastName = addressbookDTO.lastName;
        this.address = addressbookDTO.address;
    }
}
