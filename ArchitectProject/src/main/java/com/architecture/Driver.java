package com.architecture;

import com.architecture.dao.BuildingDao;
import com.architecture.model.Building;

public class Driver {
	
	public static void main(String[] args) {
		new BuildingDao().save(new Building(0,"hey ya",0));
	}
}
