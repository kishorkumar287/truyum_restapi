package com.cts.truyum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.truyum.dao.MenuItemDao;
import com.cts.truyum.dao.MenuItemService;
import com.cts.truyum.model.MenuItem;

@RestController
public class MenuItemController {
	
	@Autowired
	MenuItemService menu;
	@Autowired
	MenuItemDao m;
	
	@GetMapping("/all")
	public List<MenuItem> GetAll()
	{
		/*
		 * System.out.println("hi....."); return "hello";
		 */
		return menu.getMenuItemListCustomer();
	}
	
	@GetMapping("/get/{id}")
	public MenuItem Get(@PathVariable int id)
	{
		System.out.println("hi.....");
		return menu.get(id);
	}
	
	@PostMapping("/add")
	public MenuItem add(@RequestBody MenuItem newmenu)
	{
		System.out.println("saved");
		return m.save(newmenu);
	}
	
	@PutMapping("/update/{id}/{name}")
	public int update(@PathVariable int id, @PathVariable String name)
	{
		return menu.update(id, name);
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id)
	{
		 menu.delete(id);
	}
	
	
}
