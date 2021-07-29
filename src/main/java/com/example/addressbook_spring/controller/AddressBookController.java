package com.example.addressbook_spring.controller;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.dto.ResponseDTO;
import com.example.addressbook_spring.model.AddressBookData;
import com.example.addressbook_spring.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid @RequestBody AddressBookDTO addressbookDTO) {
        AddressBookData bookData = null;
        bookData = addressbookservice.createAddressBookData(addressbookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update/{Id}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable ("Id") int id,@Valid
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
    @GetMapping("/countbyId")
    public ResponseEntity<ResponseDTO> getCountById() {
        long countById = 0;
        countById = addressbookservice.getCountById();
        ResponseDTO respDTO = new ResponseDTO("Get Call for count by Id", countById);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/countbyState/{State}")
    public ResponseEntity<ResponseDTO> getCountByState(@PathVariable("State") String state) {
        long countByState = 0;
        countByState = addressbookservice.getCountByState(state);
        ResponseDTO respDTO = new ResponseDTO("Get Call for count by State", countByState);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/countbyCity/{City}")
    public ResponseEntity<ResponseDTO> getCountByCity(@PathVariable("City") String city) {
        long countByCity = 0;
        countByCity = addressbookservice.getCountByCity(city);
        ResponseDTO respDTO = new ResponseDTO("Get Call for count by City", countByCity);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/getByState/{State}")
    public ResponseEntity<ResponseDTO> getAddressBookDataByState(@PathVariable("State") String state){
        List<AddressBookData> bookDataList = null;
        bookDataList = addressbookservice.getAddressBookDataByState(state);
        ResponseDTO respDTO = new ResponseDTO("Get Call for get data by state", bookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/getByCity/{City}")
    public ResponseEntity<ResponseDTO> getAddressBookDataByCity(@PathVariable("City") String city){
        List<AddressBookData> bookDataList = null;
        bookDataList = addressbookservice.getAddressBookDataByCity(city);
        ResponseDTO respDTO = new ResponseDTO("Get Call for get data by city", bookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/getByNameKeyword/{namekeyword}")
    public ResponseEntity<ResponseDTO> getAddressBookDataByNameKeyword(@PathVariable("namekeyword") String namekeyword){
        List<AddressBookData> bookDataList = null;
        bookDataList = addressbookservice.getAddressBookDataByNameKeyword(namekeyword);
        ResponseDTO respDTO = new ResponseDTO("Get Call for get data by keyword", bookDataList);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
