package com.architecture.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.architecture.model.JaxBBuilding;
import com.architecture.service.BuildingService;

public class JaxBController {
	
	public static void sendBuildingById(HttpServletRequest req, HttpServletResponse res) {
//		String sid = req.getParameter("id");
//		int id = Integer.parseInt(sid);
//		Building b1 = BuildingService.getById(id);
//		JaxBBuilding j = new JaxBBuilding(b1);
		
		JaxBBuilding b = new JaxBBuilding(
				BuildingService.getById(
						Integer.parseInt(req.getParameter("id"))));
		
		try {
			JAXBContext jbc = JAXBContext.newInstance(JaxBBuilding.class);
			Marshaller marsh = jbc.createMarshaller();
			marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			marsh.marshal(b, res.getWriter());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
