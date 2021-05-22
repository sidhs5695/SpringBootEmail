package com.email.sendEmail;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendEmailApplication {

	@Autowired
	private EmailSenderService service;
	public static void main(String[] args) {
		SpringApplication.run(SendEmailApplication.class, args);
		
	}
	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		
		List<String> toEmail=new ArrayList<>();
		toEmail.add("@stevens.edu");
		toEmail.add("sids5695@gmail.com");
		try {
			service.sendSimpleEmail(toEmail, "sidhs@gmail.com",
					"This is Email Body without Attachment...",
					"This email has no attachment");
		} catch (invalidEmailException e) {
			// TODO Auto-generated catch block
			
		}

	}

}
