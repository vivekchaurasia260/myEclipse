
public class IfThenElse {
	public static void main(String[] args) {
//		boolean gameOver=true;
//		int score=800;
//		int levelCompleted=5;
//		int bonus=100;
		
		
//		calculateScore(gameOver, score, levelCompleted, bonus);
//		
//		
//		int newScore=10000;
//		int newLevelCompleted=8;
//		int newBonus=200;
//		
//		calculateScore(gameOver, newScore, newLevelCompleted, newBonus);
//		
//	}
//	
//	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//		
//		if(gameOver) {
//			int finalScore=score + (levelCompleted * bonus);
//			System.out.println("Your final score was " +finalScore);
//		}
//		
//		return -1;
//	}
		
		
		int position = calculateHighScorePosition(1500);
		displayHighScorePosition("Narayan", position);
		position = calculateHighScorePosition(900);
		displayHighScorePosition("Das", position);
		position = calculateHighScorePosition(400);
		displayHighScorePosition("Fortune", position);
		position = calculateHighScorePosition(4);
		displayHighScorePosition("Karan", position);
		
		
	}
	
	public static void displayHighScorePosition(String playerName, int position) {
		
		System.out.println(playerName+" managed to get into position "+position+" on the high score table.");
	}
	
	public static int calculateHighScorePosition(int score) {
		
		if(score>=1000)
			return 1;
		else if(score>=500 && score<1000)
			return 2;
		else if (score>=100 && score<500)
			return 3;
		
		return 4;
	}
}
