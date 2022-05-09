package Overriding;

class Movie {
	private String name;
	
	public Movie(String name) {
		this.name=name;
	}
	
	public String plot() {
		return "No plot here";
	}
	
	public String getName() {
		return name;
	}
}

class Jaws extends Movie {
	
	public Jaws() {
		super("Jaws");		// Here we need to write super() to call parent class constructor(mandatory).
	}
	
	@Override				// Here we override the parent class method to child class.
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie {
	
	public IndependenceDay() {
		super("Independence Day"); 
	}
	
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MazeRunner extends Movie {
	
	public MazeRunner() {
		super("Maze Runner");
	}
	
	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie {
	
	public StarWars() {
		super("Star Wars");
	}
	
	@Override
	public String plot() {
		return "Imperial Forces try to take over universe";
	}
}

class Forgetable extends Movie{			// Here we are not overriding any methods...
	
	public Forgetable() {
		super("Forgetable");
	}
	
	// No plot methods		
}

public class Main {

	public static void main(String[] args) {	// here is our main method...
		
		for(int i=1; i<11; i++) {

			Movie movie=randomMovie();
			System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
		}

	}
	
	// random() is a method which generate random number between 0.0 to 1.0. It return double value;
	public static Movie randomMovie() {
		int randomNumber =(int) (Math.random() * 5) + 1;  // it will return a value between 1-5;
		System.out.println("Random number generated was: " + randomNumber);
		switch(randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarWars();
			case 5:
				return new Forgetable();
			default:
				return null;
		}
		
	//	return null;
	}

}
