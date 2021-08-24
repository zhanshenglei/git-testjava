package com.hp.mapper;

import com.hp.pojo.Products;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductsMapper {

	//全查
	public List<Products> Arraylist();
	//添加
	public void add(Products products);
	//回显
	public Products findById(Integer id);
	//修改
	public void update(Products products);
	//删除
	public void delete(Integer id);


}