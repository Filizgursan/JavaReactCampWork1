package Ecommerce.core.concretes;

import java.util.Random;

import Ecommerce.core.abstracts.SendMailService;

public class SendMailManager implements SendMailService{
	
	Random rnd = new Random();
	
	@Override
	public int generateVerificationCode() {
		
		//doðrulama kodu alýnýr;
		int code = rnd.nextInt(9999);
		return code;
	}
	@Override
	public int sendMail(String email) {
		int code = generateVerificationCode();
		System.out.println("Email : " + email + "\nDoðrulama Kodu: " + code);
		return code;
		
	}



}
