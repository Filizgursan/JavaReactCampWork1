import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Filiz");
		customer.setLastName("Gürsan");
		customer.setDateOfBirth(LocalDate.of(1999,10,19));
		customer.setNationalityId("46891618306");
		
		baseCustomerManager.save(customer);
	}

}
