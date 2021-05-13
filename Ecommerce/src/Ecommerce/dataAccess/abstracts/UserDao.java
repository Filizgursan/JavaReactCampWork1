package Ecommerce.dataAccess.abstracts;

import java.util.List;

import Ecommerce.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void delete(User user);
	void update(User user);
	
	User getById(int id);
	
	boolean emailExist(User user);
	
	List<User> getAll();
	
	

}
