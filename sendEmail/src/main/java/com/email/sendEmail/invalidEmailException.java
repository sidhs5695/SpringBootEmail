package com.email.sendEmail;

public class invalidEmailException extends Exception {
	public invalidEmailException(String message)
	{
		System.out.println(message);
	}

}
