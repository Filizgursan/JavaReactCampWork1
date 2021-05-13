package Ecommerce;

import Ecommerce.business.concretes.AuthenticationManager;
import Ecommerce.business.concretes.UserManager;
import Ecommerce.core.concretes.GoogleManagerAdapter;
import Ecommerce.core.concretes.SendMailManager;
import Ecommerce.dataAccess.concretes.HibernateUserDao;
import Ecommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		//AuthenticationManager authenticationManager = new AuthenticationManager(new UserManager(new HibernateUserDao()));
		AuthenticationManager authenticationManager = new AuthenticationManager(new UserManager(new HibernateUserDao()), new SendMailManager(),
				new GoogleManagerAdapter(null));
		
		User user = new User(1,"Filiz","GÜRSAN","filiz@filiz.com","1234");
		User user1 = new User(1,"Filiz","GÜRSAN","filiz@filiz.com","1234");
		
		authenticationManager.signIn(user);
		//authenticationManager.signIn(user1);
		
		authenticationManager.signUp(user);
		//authenticationManager.signIn(user1);
		
		authenticationManager.signInWithGoogle(user);
		//authenticationManager.signIn(user1);
		
		
	
		
		

	}

}
