package com.examble.services;

import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service("MailService")
public class MailServiceImpl implements MailService  {

	@Autowired
	private JavaMailSender javaMailSender;
	
	
	@Override
	public void sendTo(String fAddress, String tAddress, String sub, String content) throws Exception {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper  mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setSentDate(new Date());
		mimeMessageHelper.setFrom(fAddress);
		mimeMessageHelper.setTo(tAddress);
		mimeMessageHelper.setText(content);
		mimeMessageHelper.setSubject(sub);
		javaMailSender.send(mimeMessage);
		
	}


	@Override
	public void sendHtml(String fAddress, String tAddress, String sub, String content) throws Exception {
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper  mimeMessageHelper = new MimeMessageHelper(mimeMessage);
		mimeMessageHelper.setSentDate(new Date());
		mimeMessageHelper.setFrom(fAddress);
		mimeMessageHelper.setTo(tAddress);
		mimeMessageHelper.setText(content , true);
		mimeMessageHelper.setSubject(sub);
		javaMailSender.send(mimeMessage);
		
	}

}
