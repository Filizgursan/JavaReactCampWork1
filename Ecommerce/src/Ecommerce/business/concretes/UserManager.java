package Ecommerce.business.concretes;

import java.util.regex.Pattern;

import Ecommerce.business.abstracts.UserService;
import Ecommerce.dataAccess.abstracts.UserDao;
import Ecommerce.entities.concretes.User;

public class UserManager implements UserService{
	
	String regex ="^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern=Pattern.compile(regex);
	
	private UserDao userDao;
	public UserManager() {
		
	}
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean passwordCheck(User user) {
		if(user.getPassword().length() >=6) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karakterden oluþturulmalýdýr.");
		}
		return false;
	}

	@Override
	public boolean emailCheck(User user) {
		if(user.getEmail().matches(regex)) {
			return true;
		}
		else {
			System.out.println("Geçerli e-posta'yý giriniz!");
		}
		return false;
	}

	@Override
	public boolean nameCheck(User user) {
		if(user.getFirstName().length() > 2 && user.getLastName().length() > 2) {
			return true;
		}
		else {
			System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr!");
		}
		return false;
	}

	@Override
	public boolean emailExist(User user) {
		if(userDao.emailExist(user)) {
			//System.out.println("Girdiðiniz e-posta daha önce alýnmýþtýr!");
			return true;
		}
		else {
			System.out.println("Girdiðiniz e-posta daha önce alýnmýþtýr!");
		}
		
		return false;
	}

	@Override
	public User add(User user) {
		
		return user;
	}

}
