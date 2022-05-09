import java.util.*;

class Employee {
	String name;
	int eno;

	public Employee(String name, int eno) {
		this.name=name;
		this.eno=eno;
	}

	@Override
	public String toString() {
		return name+" : "+eno;
	}
 
}

class Test {

	public static void main(String[] args) {

		ArrayList l = new ArrayList<Employee>();
		l.add(new Employee("Anand", 24422));
		l.add(new Employee("Vishal", 12422));
		l.add(new Employee("Singh", 92732));
		l.add(new Employee("Anand", 88362));
		l.add(new Employee("Neeraj", 26362));
		l.add(new Employee("Durgesh", 22732));

		System.out.println(l);

		Collections.sort(l,(e1,e2)->e1.name.compareTo(e2.name));
		
		System.out.println(l); 
		
	}
}