package ProjectDemo;

public class Main {
	public static void main(String[] args) {
		
		Hamburger hamburger=new Hamburger("Basic", "Sausage", 3.56, "White");
		double price =hamburger.itemizeHamburger();
		System.out.println("Total price on Order "+price);
		
		hamburger.addHamburgerAdditional1("Tomato", 0.27);
		hamburger.addHamburgerAdditional2("Lettuce", 0.75);
		hamburger.addHamburgerAdditional3("Cheese", 1.1);
		
		System.out.println("Total Burger price on Order "+hamburger.itemizeHamburger());
		
		HealthyBurger healthyBurger=new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAdditional1("Egg", 5.43);
		healthyBurger.addHealthAddition1("Lentils", 3.41);
		
		System.out.println("Total Healthy Burger price is "+healthyBurger.itemizeHamburger());
		
		DeluxeBurger db=new DeluxeBurger();
		db.addHamburgerAdditional3("Should not do this", 50.53);
		db.itemizeHamburger();
		
	}
}
