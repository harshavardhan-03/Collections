package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOimpl implements TempleDAO {
	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		System.out.println("dto= " + dto);
		System.out.println("dto is added");
		return list.add(dto);
	}

	@Override
	public int totalItems() {
		return list.size();
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed= " + dto);
			return this.list.remove(dto);
		}
		System.out.println("temple does not found");
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		Iterator <TempleDTO> itr = this.list.iterator();
		return itr.next();
	}

	@Override
	public TempleDTO findLastItem() {
		Iterator<TempleDTO> itr = this.list.iterator();
		TempleDTO lastItem = null;
		while (itr.hasNext()) {
			lastItem = itr.next();
		}
		return lastItem;
	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String loc) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(loc)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name) && templeDTO.getLocation().equals(location)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}
	@Override
	public String findLocationByName(String name) {
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				return templeDTO.getLocation();
			}
		}
		return null;
	}
}