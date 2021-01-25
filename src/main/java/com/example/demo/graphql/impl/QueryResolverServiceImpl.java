package com.example.demo.graphql.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.graphql.QueryResolverService;
import com.example.demo.model.Person;
import com.example.demo.model.User;
import com.example.demo.service.impl.PersonService;
import com.example.demo.service.impl.UserService;


@Service
public class QueryResolverServiceImpl implements QueryResolverService{
	@Autowired
	private UserService userService;
	
	@Autowired
	private PersonService personService;
	
	@Override
	public List<User> findBooks() {
		// TODO Auto-generated method stub
		return userService.findAllUserAndBook();
	}

	@Override
	public User findBookById(Long id) {
		return userService.findBookById(id);
	}

	@Override
	public List<Person> findPerson() {
		return personService.findPerson();
	}

}
