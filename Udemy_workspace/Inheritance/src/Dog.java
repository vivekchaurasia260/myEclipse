
public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		
		this.eyes=eyes;
		this.legs=legs;
		this.tail=tail;
		this.teeth=teeth;
		this.coat=coat;
		
	}
	
	private void chew() {
		System.out.println("Dog.chew() called.");
	}
	
	
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(5);
	}
	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}
	
	

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called Dog is moving at "+speed);
		//super.move(speed);
	}

	public static void main(String[] args) {
		Animal animal=new Animal("Animal", 1, 1, 5, 5);
		
		Dog dog = new Dog("German Shephard", 8, 10, 2, 4, 1, 38, "Black");
		dog.eat();
		dog.walk();
		dog.run();
	}
}
