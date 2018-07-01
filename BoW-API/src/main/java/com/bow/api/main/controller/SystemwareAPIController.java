package com.bow.api.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bow.api.main.model.SystemwareModel;
import com.bow.api.main.model.SystemwareModels;

@RestController
public class SystemwareAPIController {

	@RequestMapping("/ci")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public SystemwareModels getCustomer(
			@RequestParam(value="action") String action,
			@RequestParam(value="tplid") String templateId,
			@RequestParam(value="acctnum") String accNum,
			@RequestParam(value="primaryaccttype") String primaryAcType,
			@RequestParam(value="rmnum") String rmNum) {
		List<SystemwareModel> modelList = new ArrayList();
		//System.err.println("Action >>>"  +action);
		//System.err.println("Template Id >>>" +templateId);
		//System.err.println("Rm Number >>>" +rmNum);
		//System.err.println("Account Number >>>" +accNum);
		//System.err.println("Primary Account Type >>>" +primaryAcType);
		modelList.add(new SystemwareModel("Antonio Banderas", "ABC123456", "Active"));
		modelList.add(new SystemwareModel("Oliver Queen", "XYZ9876543", "Dormant"));

		SystemwareModels models = new SystemwareModels();
		models.setList(modelList);

		return models;
		// return new SystemwareModel("Antonio Banderas", "ABC123456", "Active");
	}
}
