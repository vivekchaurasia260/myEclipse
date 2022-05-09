package Challenge;

import java.util.ArrayList;

public class Branch {
	
	private String name;
	private ArrayList<Customers> myCustomers;
	
	public Branch(String name) {
		this.name=name;
		this.myCustomers = new ArrayList<Customers>();
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Customers> getCustomers() {
		return myCustomers;
	}
	
	public boolean newCustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName) == null) {
			this.myCustomers.add(new Customers(customerName, initialAmount));
			return true;
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String customerName, double amount) {
		Customers existingCustomer=findCustomer(customerName);
		if(existingCustomer != null) {
			existingCustomer.addTransaction(amount);
			return true;
		}
		
		return false;
	}
	
	private Customers findCustomer(String customerName) {
		for(int i=0; i<this.myCustomers.size(); i++) {
			Customers checkedCustomer=this.myCustomers.get(i);
			if(checkedCustomer.getName().equals(customerName)) {
				return checkedCustomer;
			}
		}
		
		return null;
	}

}
