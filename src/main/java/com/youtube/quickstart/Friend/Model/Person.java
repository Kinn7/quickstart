package com.youtube.quickstart.Friend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer persond_id;
    String firstName;
    String lastName;

    public Person() {
    }

    public Person(Integer persond_id, String firstName, String lastName) {
        this.persond_id = persond_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getPersond_id() {
        return persond_id;
    }

    public void setPersond_id(Integer persond_id) {
        this.persond_id = persond_id;
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

    @Override
    public String toString() {
        return "Person{" +
                "persond_id=" + persond_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
