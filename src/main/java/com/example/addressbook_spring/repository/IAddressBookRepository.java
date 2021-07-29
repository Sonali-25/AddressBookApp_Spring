package com.example.addressbook_spring.repository;

import com.example.addressbook_spring.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IAddressBookRepository extends JpaRepository<AddressBookData, Integer> {
    @Query(value="select count(State) from addressBook_data where State=?1", nativeQuery=true)
    long countByState(String state);

    @Query(value="select count(City) from addressBook_data where City=?1", nativeQuery=true)
    long countByCity(String city);

    @Query(value="select * from addressBook_data where State=?1", nativeQuery=true)
    List<AddressBookData> getAddressBookDataByState(String state);

    @Query(value="select * from addressBook_Data where City=?1", nativeQuery=true)
    List<AddressBookData> getAddressBookDataByCity(String city);

    @Query(value="select * from addressBook_Data where name like ?1% ", nativeQuery=true)
    List<AddressBookData> getAddressBookDataByNameKeyword(String keyword);
}
