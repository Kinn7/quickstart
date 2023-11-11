package com.youtube.quickstart.Friend.Repository;

import com.youtube.quickstart.Friend.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByFirstName(String firstName);
//    @Query(value = "SELECT * FROM address")
//     public Address findByAddress();
}
