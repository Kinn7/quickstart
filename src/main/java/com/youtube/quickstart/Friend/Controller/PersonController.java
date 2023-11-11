package com.youtube.quickstart.Friend.Controller;

import com.youtube.quickstart.Friend.Model.Person;
import com.youtube.quickstart.Friend.Service.PersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(path = "/api/person")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("/")
    ResponseEntity saveCustomer(@RequestBody Person person){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(person));
    }

    @GetMapping("/")
    ResponseEntity getCustomers(){
        return ResponseEntity.status(HttpStatus.OK).body(personService.findAllPersons());
    }

    @PutMapping("/")
    ResponseEntity updatePerson(@RequestBody Person person){
        return ResponseEntity.status(HttpStatus.CREATED).body(personService.createPerson(person));
    }
    @DeleteMapping("/{id}")
    ResponseEntity removePerson(@PathVariable int id){
      personService.deletePersonById(id);
        Map<String,String> resp = new HashMap<>();
        resp.put("msg","person deleted");
        return ResponseEntity.status(HttpStatus.OK).body(resp);
    }


}
