package com.example.addressbook_spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AddressBookSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressBookSpringApplication.class, args);
        log.info("Address Book App Started");
    }

}
