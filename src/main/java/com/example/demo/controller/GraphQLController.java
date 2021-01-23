package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.impl.QueryResolverService;
import com.example.demo.service.impl.UserService;

import graphql.GraphQL;
import graphql.schema.GraphQLObjectType;

@RestController
public class GraphQLController {
	@Autowired
	private UserService userService;
	@Autowired
	private QueryResolverService queryResolverService;
	
	@GetMapping("/testGetGraphQL")
	public Object testGetGraphQL(String query){
		List<User> list=queryResolverService.findBooks();
		return list;
	}

}
