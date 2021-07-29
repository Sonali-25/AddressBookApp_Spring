package com.example.addressbook_spring.service;

import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();
    AddressBookData getAddressBookDataById(int id);
    AddressBookData createAddressBookData(AddressBookDTO bookDTO);
    AddressBookData updateAddressBookData(int id,AddressBookDTO bookDTO);
    void deleteAddressBookData(int id);
}
