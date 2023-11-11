package com.youtube.quickstart.Friend.Service;

import com.youtube.quickstart.Friend.Model.Customer;
import com.youtube.quickstart.Friend.Repository.AddressRepository;
import com.youtube.quickstart.Friend.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
//    private final AddressRepository addressRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public Iterable<Customer> getCustomers(){
        return  customerRepository.findAll();


    }

    public List<Customer> getCustomerByFirstName(String firstName){
        return customerRepository.findByFirstName(firstName);
    }

    public Customer saveCustomer(Customer customer){
       // customer.setCustomer_id(2);
        //customer.setAddress(1);

        return customerRepository.save(customer);
    }
//
//    public Iterable<Address> getAddress(){
//        return friendRepository.findAddress();
//    }


//    public List<Friend> getFriends(){
//        return List.of(new Friend(
//                1L,
//                "kidus",
//                "berhanu",
//                23,
//                false
//        ));
//    }
}
