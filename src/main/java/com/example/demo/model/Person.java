package com.example.demo.model;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private int age;
	private int parentId;
	private List<Person> childrens;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public List<Person> getChildrens() {
		return childrens;
	}
	public void setChildrens(List<Person> childrens) {
		this.childrens = childrens;
	}
	
	
}
