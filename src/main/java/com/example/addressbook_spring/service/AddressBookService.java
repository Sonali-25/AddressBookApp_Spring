package com.example.addressbook_spring.service;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.exceptions.AddressBookException;
import com.example.addressbook_spring.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService {

    private List<AddressBookData> addressBookDataList = new ArrayList<>();

    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return addressBookDataList.stream()
                .filter(bookData -> bookData.getId()==id)
                .findFirst()
                .orElseThrow(() -> new AddressBookException("Person Not Found"));
    }
    @Override
    public AddressBookData createAddressBookData(AddressBookDTO bookDTO) {
        AddressBookData bookData = null;
        bookData=new AddressBookData(addressBookDataList.size()+1, bookDTO);
        addressBookDataList.add(bookData);
        return bookData;
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO bookDTO) {
        AddressBookData bookData = this.getAddressBookDataById(id);
        bookData.setName(bookDTO.name);
        bookData.setAddress(bookDTO.address);
        bookData.setCity(bookDTO.city);
        bookData.setState(bookDTO.state);
        bookData.setZipcode(bookDTO.zipcode);
        bookData.setPhoneNumber(bookDTO.phoneNumber);
        return addressBookDataList.set(id-1,bookData);
    }

    @Override
    public void deleteAddressBookData(int id) {
        AddressBookData bookData = this.getAddressBookDataById(id);
        addressBookDataList.remove(bookData);
    }
}
