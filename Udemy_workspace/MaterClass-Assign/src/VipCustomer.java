
public class VipCustomer {
	private String name, emailAddress;
	private double creditLimit;
	
	public VipCustomer() {
		this("Default Name", 50000, "vivekchaurasia260@yahoo.in");
	}
	public VipCustomer(String name, double creditLimit) {
		this(name, creditLimit, "gandalvgrey268@jdu.cim");
	}
	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.emailAddress=emailAddress;
	}
		
	public String getName() {
		return name;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public static void main(String[] args) {
		
		VipCustomer vip=new VipCustomer();
		System.out.println(vip.getName());
		VipCustomer vip2=new VipCustomer("Vivek Cha", 50000);
		System.out.println(vip2.getName());
		VipCustomer vip3=new VipCustomer("Aya Eva", 15000, "eva.adam@jdjf.dj");
		System.out.println(vip3.getName());
		
	}
}
