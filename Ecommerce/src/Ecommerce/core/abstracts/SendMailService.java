package Ecommerce.core.abstracts;

public interface SendMailService {
	
	int sendMail(String mail);
    int generateVerificationCode();

}
