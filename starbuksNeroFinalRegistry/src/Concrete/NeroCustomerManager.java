package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {
	//Yönetici Mernis kontrolünü Nero dan da yap derse bunu hazýrladýk. Sadece mainden eklemesi kaldý.
	private ICustomerCheckService ýcCheckService ;

	public NeroCustomerManager(ICustomerCheckService icCheckService) {
		super();
		ýcCheckService = icCheckService;
	}

	@Override
	public void save(Customer customer) throws Exception {
		if(ýcCheckService.CheckIfRealPerson(customer)) {
		super.save(customer);
			}else {
				System.out.println("Kullanýcý bulunamadý");
			}
	}
	
	
	
	
	
	
	

}
