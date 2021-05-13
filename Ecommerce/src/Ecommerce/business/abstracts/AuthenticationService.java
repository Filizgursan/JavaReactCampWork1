package Ecommerce.business.abstracts;

import Ecommerce.entities.concretes.User;

public interface AuthenticationService {
	
	void signIn (User user);
	void signUp (User user);
	void signInWithGoogle (User user);

}
