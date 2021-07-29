package com.example.addressbook_spring.model;

import com.example.addressbook_spring.dto.AddressBookDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="addressBook_Data")
@Data
@NoArgsConstructor
public class AddressBookData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;
    private String address;
    public String city;
    public String state;
    public int zipcode;
    public String phoneNumber;

    public AddressBookData(AddressBookDTO addressbookDTO) {
        this.name = addressbookDTO.name;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zipcode = addressbookDTO.zipcode;
        this.phoneNumber = addressbookDTO.phoneNumber;
    }

    public AddressBookData(int id, AddressBookDTO addressbookDTO) {
        this.id = id;
        this.name = addressbookDTO.name;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zipcode = addressbookDTO.zipcode;
        this.phoneNumber = addressbookDTO.phoneNumber;
    }

    public void updateAddressBookData(AddressBookDTO addressbookDTO) {
        this.name = addressbookDTO.name;
        this.address = addressbookDTO.address;
        this.city = addressbookDTO.city;
        this.state = addressbookDTO.state;
        this.zipcode = addressbookDTO.zipcode;
        this.phoneNumber = addressbookDTO.phoneNumber;
    }

}
