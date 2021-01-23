package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.example.demo.model.User;


@Service
public class QueryResolverServiceImpl implements QueryResolverService{
	@Autowired
	private UserService userService;
	
	@Override
	public List<User> findBooks() {
		// TODO Auto-generated method stub
		return userService.findAllUserAndBook();
	}

}
