
public class Main {
	public static void main(String[] args) {
//		Player player=new Player();
//		player.name="Vivek";
//		player.health=20;
//		player.weapon="Sword";
//				
//		int damage=10;
//		player.loseHealth(damage);
//		System.out.println("Remaining Health = "+player.healthRemaining());
//		
//		damage=11;
//		player.health=200;
//		player.loseHealth(damage);
//		System.out.println("Remaining Health = "+player.healthRemaining());
		
		EnhancedPlayer player=new EnhancedPlayer("Vivek", 200, "Sword");
		System.out.println("Initial health is " +player.getHealth());
		
		
	}
}
