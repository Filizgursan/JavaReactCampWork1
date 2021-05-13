package Ecommerce.business.abstracts;

import Ecommerce.entities.concretes.User;

public interface UserService {
	
	public boolean passwordCheck (User user);
	public boolean emailCheck (User user);
	public boolean nameCheck (User user);
	public boolean emailExist(User user);
	public User add(User user);
	
}
