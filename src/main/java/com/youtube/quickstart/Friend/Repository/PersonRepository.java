package com.youtube.quickstart.Friend.Repository;

import com.youtube.quickstart.Friend.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {
}
