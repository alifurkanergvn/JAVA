package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	private ICustomerCheckService customerCheckService;

    public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    public void save(Customer customer) throws Exception {
        if (customerCheckService.CheckIfRealPerson(customer)){
            super.save(customer);
            //buradaki super ne anlamda öðren!

        }else{
            //throw new Exception("Not a valid person");
            System.out.println("Hatalý kullanýcý giriþi");
        }
    }


}
