package com.youtube.quickstart.Friend.Service;

import com.youtube.quickstart.Friend.Model.Person;
import com.youtube.quickstart.Friend.Repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public Iterable<Person> findAllPersons(){
        return personRepository.findAll();
    }

    public void deletePersonById(Integer id){
        personRepository.deleteById(id);
    }

}
