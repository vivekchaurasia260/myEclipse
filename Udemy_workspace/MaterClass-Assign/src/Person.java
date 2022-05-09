
public class Person {
	String firstName, lastName;
	int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<0 || age>100)
			this.age = 0;
		else
			this.age=age;
	}
	public boolean isTeen() {
		if(age>12 && age<20)
			return true;
		
		return false;
	}
	public String getFullName() {
		if(firstName.isEmpty() || lastName.isEmpty())
			return "";
		else if(firstName=="")
			return lastName;
		else if(lastName=="")
			return firstName;
		
		return firstName +" "+lastName;
	}
	
	public static void main(String[] args) {
		Person p=new Person();
		
		p.setFirstName("Vivek");
		p.setLastName("Chaurasia");
		p.setAge(26);
		
		System.out.println("My Name is "+p.getFirstName()+" "+p.getLastName()+" and my age is "+p.getAge());
	}
}
