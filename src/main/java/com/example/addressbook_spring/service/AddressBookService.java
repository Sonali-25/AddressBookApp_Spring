package com.example.addressbook_spring.service;


import com.example.addressbook_spring.dto.AddressBookDTO;
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
        return addressBookDataList.get(id-1);
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
        return addressBookDataList.set(id-1,bookData);
    }
    @Override
    public void deleteAddressBookData(int id) {
        addressBookDataList.remove(id-1);
    }
}
