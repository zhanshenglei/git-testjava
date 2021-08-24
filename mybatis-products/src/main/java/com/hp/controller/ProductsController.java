package com.hp.controller;


import com.hp.pojo.Products;
import com.hp.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Controller
public class ProductsController {
	@Autowired
	ProductsService productsService;
	@RequestMapping("select")
	public String select(Model model){
		List<Products> Arraylist=productsService.Arraylist();
		model.addAttribute("Array", Arraylist);
		System.out.println("全查");
		return "list";
	}

	//跳转添加页面
	@RequestMapping("addlist")
	public String addlist(){
		return "add";
	}
	//添加
	@RequestMapping("add")
	public String add(Products products){
		productsService.add(products);
		System.out.println("添加");
		return "forward:select";
	}
	//跳转修改页面
	@RequestMapping("/updateById")
	public String updateById(int id,Model model){
		Products updateById=productsService.findById(id);
		model.addAttribute("produ", updateById);
		return "update";
	}
	//修改
	@RequestMapping("/update")
	public String update(Products products){
		productsService.update(products);
		return "forward:select";
	}
	//删除
	@RequestMapping("delete")
	public String delete(int id){
			productsService.delete(id);
		return "forward:select";
	}

}
