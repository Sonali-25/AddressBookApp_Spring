package com.example.addressbook_spring.service;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.exceptions.AddressBookException;
import com.example.addressbook_spring.model.AddressBookData;
import com.example.addressbook_spring.repository.IAddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    private IAddressBookRepository addressBookRepo;


    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepo.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int id) {
        return addressBookRepo
                .findById(id)
                .orElseThrow(() -> new AddressBookException("Person Not Id: "+id+
                        "doesn't exist."));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO bookDTO) {
        AddressBookData bookData = null;
        bookData=new AddressBookData(bookDTO);
        log.debug("Person Data: "+bookData.toString());
        return addressBookRepo.save(bookData);
    }

    @Override
    public AddressBookData updateAddressBookData(int id,AddressBookDTO bookDTO) {
        AddressBookData bookData = this.getAddressBookDataById(id);
        bookData.updateAddressBookData(bookDTO);
        return addressBookRepo.save(bookData);
    }

    @Override
    public void deleteAddressBookData(int id) {
        AddressBookData bookData = this.getAddressBookDataById(id);
        addressBookRepo.delete(bookData);
    }
}
