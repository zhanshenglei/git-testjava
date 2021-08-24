package com.hp.service;

import com.hp.pojo.Products;

import java.util.List;

public interface ProductsService {
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
