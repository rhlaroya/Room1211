package com.architecture.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {
	
	public static String process(HttpServletRequest req) {
		switch(req.getRequestURI()) {
		case "/ArchitectProject/create.go":
			return CreateController.create(req);
		
			
		default:
			return "";
		}
	}
	public static void directProcess(HttpServletRequest req, HttpServletResponse resp) {
		switch(req.getRequestURI())	{
		case "/ArchitectProject/building.xml":
				JaxBController.sendBuildingById(req, resp);
				break;
		case "/ArchitectProject/building.json":
				JacksonController.sendBuilding(req, resp);
				break;
	}
	}
}
