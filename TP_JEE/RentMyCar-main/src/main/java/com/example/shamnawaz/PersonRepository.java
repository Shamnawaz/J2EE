package com.example.shamnawaz;

import org.springframework.data.repository.CrudRepository; 

public interface PersonRepository extends CrudRepository<Person, String> {

}
