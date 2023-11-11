package com.youtube.quickstart.Friend.Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Address {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer address_id;
    private String street;
    private String city;

    @OneToMany(mappedBy = "address")
    private List<Customer> customer;

    public Address() {
    }

    public Address(Integer address_id, String street, String city, List<Customer> customer) {
        this.address_id = address_id;
        this.street = street;
        this.city = city;
        this.customer = customer;
    }

    public Integer getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Integer address_id) {
        this.address_id = address_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address_id=" + address_id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", customer=" + customer +
                '}';
    }
}
