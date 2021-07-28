package com.example.addressbook_spring.controller;


import com.example.addressbook_spring.dto.AddressBookDTO;
import com.example.addressbook_spring.dto.ResponseDTO;
import com.example.addressbook_spring.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressBook")
public class AddressBookController {

    @RequestMapping(value={" ", "/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData bookData = new AddressBookData(1,new AddressBookDTO
                ("Sonali","Jha","Bihar"));
        ResponseDTO respDTO = new ResponseDTO("Get Call Successful", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("Id") int Id){
        AddressBookData bookData = new AddressBookData(1,new AddressBookDTO
                ("Sonali","Jha","Bihar"));
        ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successful", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@RequestBody AddressBookDTO addressbookDTO) {
        AddressBookData bookData = new AddressBookData(1,addressbookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressbookDTO) {
        AddressBookData bookData = new AddressBookData(1,addressbookDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated AddressBook Data Successfully", bookData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int Id) {
        ResponseDTO respDTO = new ResponseDTO("Created AddressBook Data Successfully",
                "Deleted Id : "+ Id);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
