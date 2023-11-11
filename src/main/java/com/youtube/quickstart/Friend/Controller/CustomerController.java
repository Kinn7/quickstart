package com.youtube.quickstart.Friend.Controller;

import com.youtube.quickstart.Friend.Model.Address;
import com.youtube.quickstart.Friend.Model.Customer;
import com.youtube.quickstart.Friend.Service.AddressService;
import com.youtube.quickstart.Friend.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "api/friend")
public class CustomerController {

    private final CustomerService customerService;
    private final AddressService addressService;

    @Autowired
    public CustomerController(CustomerService customerService, AddressService addressService){
        this.customerService = customerService;
        this.addressService = addressService;
    }

//
//    @GetMapping("/friends")
//    //public ResponseEntity<Iterable<Friend>> getFriends(){
//    public ResponseEntity<?> getCustomer(){
//        var friends = customerService.getCustomerByFirstName("Mia");
//        if(friends.isEmpty()){
//            Map<String,String> response = new HashMap<>();
//            response.put("msg","No friends found");
//           return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//        }
//        System.out.println(friends.size());
//       // return new ResponseEntity<>(friends,HttpStatus.OK);
//        return ResponseEntity.status(HttpStatus.OK).body(friends);
//    }

    @PostMapping
    ("/customer")
    public ResponseEntity<Map<String,String>> saveCustomer(@RequestBody Customer  customer){
//        System.out.println(customer);
//         Address a = new Address();
//         a.setAddress_id(1);
//         customer.setAddress(a);
         var checkCustomerSaved = customerService.saveCustomer(customer);
         Map<String,String> resp = new HashMap<>();
         resp.put("msg","customer information saved");
         return ResponseEntity.status(HttpStatus.OK).body(resp);
    }

    @GetMapping("/customers")
    public ResponseEntity<Map<String,Iterable<Customer>>> getCustomers(){
    //public ResponseEntity<Iterable<Customer>> getCustomers(){
        var customers = customerService.getCustomers();
        Map<String,Iterable<Customer>> resp = new HashMap<>();
       resp.put("data",customers);
 //       return ResponseEntity.status(HttpStatus.OK).body(customers);
        return ResponseEntity.status(HttpStatus.OK).body(resp);
    }
    @GetMapping("/firstName/{firstName}")
    public ResponseEntity<List<Customer>> getFirstName(@PathVariable String firstName){
        return new ResponseEntity<>(customerService.getCustomerByFirstName(firstName),HttpStatus.BAD_REQUEST);
    }


//    @GetMapping("/addresses")
//    public ResponseEntity<Iterable<Address>> getAddress(){
//        return ResponseEntity.ok(friendService.getAddress());
//    }



//    @GetMapping("/students")
//    public List<Friend> getFriends(){
//        return friendService.getFriends();
//    }
}
