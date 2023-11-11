package com.youtube.quickstart.Friend.Service;

import com.youtube.quickstart.Friend.Model.Address;
import com.youtube.quickstart.Friend.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
        private final AddressRepository addressRepository;


        public AddressService(AddressRepository addressRepository){
            this.addressRepository = addressRepository;
        }


}
