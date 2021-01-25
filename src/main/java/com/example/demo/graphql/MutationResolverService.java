package com.example.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.example.demo.model.Person;

public interface MutationResolverService extends GraphQLMutationResolver {
	Person addPerson(Person person);
}
