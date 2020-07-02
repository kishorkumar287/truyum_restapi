package com.cts.truyum.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.truyum.model.MenuItem;

@Service
public class MenuItemService {
	
	@Autowired
	MenuItemDao menu;
	
	public List<MenuItem> getMenuItemListCustomer()
	{
		return menu.findAll();
	}
	
	public MenuItem get(int id)
	{
		return menu.findById(id);
	}
	
	public int update(int id,String name)
	{
		return menu.update(id,name);
	}

	public void delete(int id)
	{
		menu.deleteById(id);
	}
	
	
}
