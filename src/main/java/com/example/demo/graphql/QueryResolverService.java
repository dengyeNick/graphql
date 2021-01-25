package com.example.demo.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.Person;
import com.example.demo.model.User;

public interface QueryResolverService extends GraphQLQueryResolver{
	List<User> findBooks();
	
	User findBookById(Long id);
	
	List<Person> findPerson();
}
