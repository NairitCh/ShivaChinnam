package com.bow.consumer;

import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.bow.api.main.model.SystemwareModel;
import com.bow.api.main.model.SystemwareModels;

public class APIConsumer {

	public static void main(String[] args) {
		
		RestTemplate restTemplate = new RestTemplate();
		SystemwareModels response = restTemplate.getForObject("http://localhost:8080//getCustomer", SystemwareModels.class);
		List<SystemwareModel> modelList = response.getList();
		System.err.println("CUSTOMER INFORMATION *****");
		modelList.forEach(obj ->{
			System.out.println("Customer Name >>>" +obj.getCustomerName());
			System.out.println("Customer Account Number >>>" +obj.getAccountNumber());
			System.out.println("Customer Account Status >>>" +obj.getAccountStatus());
		});
	}

}
