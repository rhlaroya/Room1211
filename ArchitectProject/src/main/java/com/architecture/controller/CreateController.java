package com.architecture.controller;

import javax.servlet.http.HttpServletRequest;

import com.architecture.service.CreateService;

public class CreateController {
	
	public static String create(HttpServletRequest req) {
		String name = req.getParameter("building_name");
		int id = Integer.parseInt(req.getParameter("owner_id"));
		CreateService.create(name, id);
		return "index.html";
	}
}
