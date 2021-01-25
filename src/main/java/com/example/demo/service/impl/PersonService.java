package com.example.demo.service.impl;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	List<Person> findPerson();

	Person addPerson(Person person);
}
