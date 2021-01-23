package com.example.demo.service.impl;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.User;

public interface QueryResolverService extends GraphQLQueryResolver{
	List<User> findBooks();
}
