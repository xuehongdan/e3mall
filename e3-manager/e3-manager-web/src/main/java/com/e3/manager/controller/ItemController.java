package com.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.e3.manager.service.ItemService;
import com.e3.pojo.TbItem;

@RestController
public class ItemController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping("/item/{itemId}")
	public TbItem findItemById(@PathVariable Long itemId){
		TbItem item = itemService.findItemById(itemId);
		return item;
	}
}
