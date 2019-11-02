package com.zzz.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzz.springcloud.entities.Dept;

@Mapper   //springboot和mybatis整合时mapper接口需使用注解@Mapper
public interface DeptDao {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
