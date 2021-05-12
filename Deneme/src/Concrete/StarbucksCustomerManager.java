package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	//dependency injection
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}
	
	public void save(Customer customer) {
		if(customerCheckService.CheckIfRealPerson(customer) == true) {
			System.out.println("Save to db : " + customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}

}
