package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;


@Mapper
public interface UserMapper {

	List<User> findAllUserAndBook();
}
