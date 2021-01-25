package com.example.demo.graphql.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.graphql.MutationResolverService;
import com.example.demo.model.Person;
import com.example.demo.service.impl.PersonService;

@Service
public class MutationResolverServiceImpl implements MutationResolverService{

	@Autowired
	private PersonService personService;
	
	@Override
	public Person addPerson(Person person) {
		return personService.addPerson(person);
	}
	
}
