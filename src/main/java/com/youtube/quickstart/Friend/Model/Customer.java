package com.youtube.quickstart.Friend.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customer_id;
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean married;

    @ManyToOne//{CascadeType.MERGE, CascadeType.DETACH})
    @JoinColumn(name = "address_id",nullable = false)
    @JsonIgnore
    private Address address;

//    @Column(name = "address_id", insertable = false, updatable = false)
//    @JsonIgnore
//    private Integer addressId;

//    public Integer getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(Integer addressId) {
//        this.addressId = addressId;
//    }

    public Customer() {
    }

    public Customer(Integer customer_id, String firstName, String lastName, Integer age, Boolean married){//, Integer addressId) {
        this.customer_id = customer_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.married = married;
   //     this.addressId = address;
  //      this.addressId = addressId;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarried() {
        return married;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

//    public Integer getAddressId() {
//        return addressId;
//    }
//
//    public void setAddressId(Integer addressId) {
//        this.addressId = addressId;
//    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", married=" + married +
                ", address=" + address +
//                ", addressId=" + addressId +
                '}';
    }
}