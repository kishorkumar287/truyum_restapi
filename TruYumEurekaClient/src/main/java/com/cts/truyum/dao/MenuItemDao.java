package com.cts.truyum.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cts.truyum.model.MenuItem;

@Repository
public interface MenuItemDao extends JpaRepository<MenuItem, Integer> {
	
	
	public MenuItem findById(int id);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("UPDATE MenuItem a SET a.name = :name WHERE a.id = :id")
	int update(@Param("id") int id, @Param("name") String name);
	
	public void deleteById(int id);

}
