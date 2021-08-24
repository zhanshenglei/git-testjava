package com.hp.service.impl;


import com.hp.mapper.ProductsMapper;
import com.hp.pojo.Products;
import com.hp.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ProductsServiceImpl implements ProductsService {
	@Autowired
	ProductsMapper productsMapper;
	@Override
	public List<Products> Arraylist() {
		return productsMapper.Arraylist();
	}

	@Override
	public void add(Products products) {
		Date date=new Date();
		products.setAddtime(date);
		productsMapper.add(products);
	}

	@Override
	public Products findById(Integer id) {
		return productsMapper.findById(id);
	}

	@Override
	public void update(Products products) {
		Date date=new Date();
		products.setAddtime(date);
		productsMapper.update(products);
	}

	@Override
	public void delete(Integer id) {

		productsMapper.delete(id);
	}
}
