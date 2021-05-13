package Ecommerce.core.abstracts;

import Ecommerce.entities.concretes.User;

public interface SignUpService {
	
	public void signUp(User user);
	//public void signUp(String email, String password);
}
