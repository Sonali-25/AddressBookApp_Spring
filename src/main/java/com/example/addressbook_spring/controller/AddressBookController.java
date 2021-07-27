package com.example.addressbook_spring.controller;


import com.example.addressbook_spring.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("addressBook")
public class AddressBookController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<String> getAddressBookData(){
        return new ResponseEntity<>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{Id}")
    public ResponseEntity<String> getAddressBookData(@PathVariable ("Id") int Id){
        return new ResponseEntity<>("Get Call Success For Id: "+Id,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addBookDTO){
        return new ResponseEntity<>("Created AddressBook Data For: "+addBookDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addBookDTO){
        return new ResponseEntity<>("Updated AddressBook Data For: "+addBookDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{Id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable ("Id") int Id){
        return new ResponseEntity<>("Delete Call Success For Id: "+Id,HttpStatus.OK);
    }
}
