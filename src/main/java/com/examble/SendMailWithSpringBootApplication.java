package com.examble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examble.services.MailService;

@SpringBootApplication
public class SendMailWithSpringBootApplication implements CommandLineRunner{

	@Autowired
	private MailService mailService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SendMailWithSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			//mailService.sendTo("mahmouddaood20@gmail.com", "mahmouddaood20@gmail.com", "Rivo", "How are you ?");
            mailService.sendHtml("mahmouddaood20@gmail.com", "mahmouddaood20@gmail.com", "Rivo2", "<br/> <p><b><u>How are you ?</u></b></p>"
            		+ "<a href='http://google.com/'>click</a>");
    System.out.println("Done");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
