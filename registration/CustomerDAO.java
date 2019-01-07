package login.vivek.registration;

public interface CustomerDAO {
public int insertcustomer(customer c);
	public customer getCustomer(String username, String pass);
}
