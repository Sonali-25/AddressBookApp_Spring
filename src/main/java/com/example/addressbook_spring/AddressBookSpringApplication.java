package com.example.addressbook_spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class AddressBookSpringApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(AddressBookSpringApplication.class, args);
        log.info("Address Book App Started in {} Environment",
                context.getEnvironment().getProperty("environment"));

        log.info("Address Book Database User is {}",
                context.getEnvironment().getProperty("spring.datasource.username"));
    }

}


