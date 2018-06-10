package com.bow.api.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bow.api.main.model.SystemwareModel;
import com.bow.api.main.model.SystemwareModels;

@RestController
public class SystemwareAPIController {
	
	@RequestMapping("/getCustomer")	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public SystemwareModels getCustomer() {
		List<SystemwareModel> modelList = new ArrayList();
		modelList.add(new SystemwareModel("Antonio Banderas", "ABC123456", "Active"));
		modelList.add(new SystemwareModel("Oliver Queen", "XYZ9876543", "Dormant"));
		
		SystemwareModels models = new SystemwareModels();
		models.setList(modelList);
		
		return models;
		//return new SystemwareModel("Antonio Banderas", "ABC123456", "Active");
	}
}
