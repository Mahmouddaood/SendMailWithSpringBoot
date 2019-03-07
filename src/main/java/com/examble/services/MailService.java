package com.examble.services;

public interface MailService {

	void sendTo(String fAddress , String tAddress , String sub , String content) throws Exception;
	
	void sendHtml(String fAddress , String tAddress , String sub , String content) throws Exception;

}
