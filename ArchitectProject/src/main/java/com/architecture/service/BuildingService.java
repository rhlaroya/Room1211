package com.architecture.service;

import com.architecture.dao.BuildingDao;
import com.architecture.model.Building;

public class BuildingService {
	
	public static Building getById(int id) {
		return new BuildingDao().findById(id);
	}
}
