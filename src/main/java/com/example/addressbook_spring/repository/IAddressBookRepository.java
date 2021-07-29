package com.example.addressbook_spring.repository;

import com.example.addressbook_spring.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressBookRepository extends JpaRepository<AddressBookData, Integer> {
}
