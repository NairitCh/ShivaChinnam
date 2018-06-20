package com.bow.api.main.model;

public class ResponseModel {

	private static String sessionId;
	private static String jSessionId;
	private static String tId;
	
	public static String getSessionId() {
		return sessionId;
	}
	public static void setSessionId(String sessionId) {
		ResponseModel.sessionId = sessionId;
	}
	public static String getjSessionId() {
		return jSessionId;
	}
	public static void setjSessionId(String jSessionId) {
		ResponseModel.jSessionId = jSessionId;
	}
	public static String gettId() {
		return tId;
	}
	public static void settId(String tId) {
		ResponseModel.tId = tId;
	}
	
	
	
}
