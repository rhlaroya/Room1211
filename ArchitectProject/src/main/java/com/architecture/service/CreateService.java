package com.architecture.service;

import com.architecture.dao.BuildingDao;
import com.architecture.model.Building;

public class CreateService {
	
	public static void create(String name, int id) {
		int result = new BuildingDao().save(new Building(0,name,id));
		
	}
}
