package Ecommerce.core.concretes;

import Ecommerce.core.abstracts.SignUpService;
import Ecommerce.entities.concretes.User;

public class GoogleManagerAdapter implements SignUpService{

	private GoogleManagerAdapter googleService;
	
	public GoogleManagerAdapter() {
		
	}
	
	public GoogleManagerAdapter(GoogleManagerAdapter googleService) {
		this.googleService = googleService;
	}
	
	@Override
	public void signUp(User user) {
		googleService.signUp(user.getEmail(), user.getPassword());
		
	}

	
	public void signUp(String email, String password) {
		// TODO Auto-generated method stub
		
		
	}

	

}
