package com.bow.api.main.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="systemwarecustomer")
public class SystemwareModels {
	
	private String id;
	private List<SystemwareModel> list;

	public List<SystemwareModel> getList() {
		return list;
	}

	public void setList(List<SystemwareModel> list) {
		this.list = list;
	}
	
}
