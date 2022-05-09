package Challenge;

public class Main {
	
	public static void main(String[] args) {
		
		Bank bank=new Bank("State Bank of India");
		bank.addBranch("Vishewarganj");
		bank.addCustomer("Vishewarganj", "Vivek", 150.05);
		bank.addCustomer("Vishewarganj", "Ajay", 190.15);
		bank.addCustomer("Vishewarganj", "Rasmi", 310.25);
		
		bank.addBranch("Sigra");
		bank.addCustomer("Sigra", "Rohan", 90.05);
		bank.addCustomer("Sigra", "Adi", 300.15);
		
		bank.addCustomerTransaction("Vishewarganj", "Ajay", 11.70);
		bank.addCustomerTransaction("Vishewarganj", "Ajay", 13.50);
		bank.addCustomerTransaction("Vishewarganj", "Rasmi", 1.30);
		
		bank.listCustomers("Vishewarganj", true);
		
		bank.listCustomers("Sigra", true);
		
	}

}
