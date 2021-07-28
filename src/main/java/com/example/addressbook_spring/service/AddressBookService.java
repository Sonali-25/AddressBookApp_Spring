package com.example.addressbook_spring.service;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {
    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> bookDataList = new ArrayList<>();
        bookDataList.add(new AddressBookData(1,new AddressBookDTO("Sonali",
                "Jha","Bihar")));
        return bookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        AddressBookData bookData = null;
        bookData=new AddressBookData(1,new AddressBookDTO("Sonali",
                "Jha","Bihar"));
        return bookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO bookDTO) {
        AddressBookData personData = null;
        personData=new AddressBookData(1, bookDTO);
        return personData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO bookDTO) {
        AddressBookData personData = null;
        personData=new AddressBookData(1, bookDTO);
        return personData;
    }

    @Override
    public void deleteAddressBookData(int id) {

    }
}
