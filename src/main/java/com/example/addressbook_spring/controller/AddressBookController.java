package com.example.addressbook_spring.controller;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.dto.ResponseDTO;
import com.example.addressbook_spring.model.AddressBookData;
import com.example.addressbook_spring.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("addressBook")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressbookservice;

    @RequestMapping(value={" ", "/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> bookDataList = null;
        bookDataList = addressbookservice.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookDataById(@PathVariable("Id") int id){
        AddressBookData bookData = null;
        bookData = addressbookservice.getAddressBookDataById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressbookDTO) {
        AddressBookData bookData = null;
        bookData = addressbookservice.createAddressBookData(addressbookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{Id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable ("id") int id,
                                                             @RequestBody AddressBookDTO addressbookDTO) {
        AddressBookData bookData = null;
        bookData = addressbookservice.updateAddressBookData(id,addressbookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int id) {
        addressbookservice.deleteAddressBookData(id);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully",
                "Deleted Id : "+ id);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
