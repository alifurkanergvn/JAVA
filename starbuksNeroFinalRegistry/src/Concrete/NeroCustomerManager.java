package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	//Y�netici Mernis kontrol�n� Nero dan da yap derse bunu haz�rlad�k. Sadece mainden eklemesi kald�.
	private ICustomerCheckService �cCheckService ;

	public NeroCustomerManager(ICustomerCheckService icCheckService) {
		super();
		�cCheckService = icCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if(�cCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);
			}else {
				System.out.println("Kullan�c� bulunamad�");
			}
	}
	
	
	
	
	
	
	

}
