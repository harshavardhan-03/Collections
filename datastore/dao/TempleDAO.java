package com.xworkz.datastore.dao;

import com.xworkz.datastore.dto.TempleDTO;

public interface TempleDAO {

	boolean save(TempleDTO dto);
	int totalItems();
	boolean delete(TempleDTO dto);
	TempleDTO findFirstItem();
	TempleDTO findLastItem();
	TempleDTO findByName(String name);
	TempleDTO findByLocation(String loc);
	TempleDTO findByLocationAndName(String name,String location);
	String findLocationByName(String name);
}