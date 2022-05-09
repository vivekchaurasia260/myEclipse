
public class BankAccount {
	private long accountNumber, phoneNumber, balance;
	String customerName, email;
	
	public BankAccount(long accountNumber, long phoneNumber, long balance, String customerName, String email) {
		this.accountNumber=accountNumber;
		this.phoneNumber=phoneNumber;
		this.balance=balance;
		this.customerName=customerName;
		this.email=email;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setBalance(long balance) {
		this.balance=balance;
	}
	public long getBalance() {
		return balance;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void depositFunds(int deposit) {
		this.balance+=deposit;
		System.out.println("Hi, your account is incremented with "+deposit+" Rs.");
		System.out.println("Updated Balance is "+balance+ " Rs.");
	}
	public void withdrawFunds(int withDraw) {
		if(withDraw<=balance && withDraw>=0) {
			this.balance-=withDraw;
			System.out.println("Hi, your account is decremented with "+withDraw+" amount.");
			System.out.println("Updated balance is "+balance+".");
		}				
		else
			System.out.println("Insufficient balance");
	}
	
	public static void main(String[] args) {
		
		BankAccount bank=new BankAccount(3401737821927L, 9367267256L, 0, "Zaltan Ibrahim", "i.zaltan877@orkut.com" );
		
		System.out.println("Hi "+bank.getCustomerName()+", your Account number is "+bank.getAccountNumber()+" with balance "+bank.getBalance());
		
		bank.depositFunds(5000);
		bank.withdrawFunds(4900);
			
	}
	
}
