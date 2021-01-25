package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.PersonMapper;
import com.example.demo.model.Person;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	PersonMapper personMapper;
	@Override
	public List<Person> findPerson() {
		List<Person> list=personMapper.findPerson();
		//以pid为Key进行分组存入Map
		Map<Integer,List<Person>> pidListMap =
				list.stream().collect(Collectors.groupingBy(Person::getParentId,LinkedHashMap::new,Collectors.toList()));
		list.stream().forEach(item->{
			item.setChildrens(pidListMap.get(item.getId())==null?new ArrayList<>():pidListMap.get(item.getId()));
		});
		//取出顶层节点的对象，本例顶层节点的"PID"为0,注意是PID
//		Object obj = JSONArray.toJSON(pidListMap.get(0l));
//		String json = obj.toString();
//		System.out.println(json);
		return pidListMap.get(0)==null?new ArrayList<>():pidListMap.get(0);
	}
	
	@Override
	public Person addPerson(Person person) {
		return person;
	}

}
