
public class GameLauncher{
	
	public static void main(String[] args){
		
		GuessGame game = new GuessGame();
		game.startGame();
	}
}
 class GuessGame{
	
	Player p1;
	Player p2;
	Player p3;
	
	public void startGame(){
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		
		String winner = new String();
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 nd 9...");
		
		while(true){
			
			System.out.println("Number to guess is: "+targetNumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			guessp2 = p2.number;
			guessp3 = p3.number;
			
			System.out.println("Player 1 guessed: " + guessp1);
			System.out.println("Player 2 guessed: " + guessp2);
			System.out.println("Player 3 guessed: " + guessp3);
			
			if(guessp1 == targetNumber){
				p1isRight = true;
				winner = "Player 1";
			}
			if(guessp2 == targetNumber){
				p2isRight = true;
				winner = "Player 2";
			}
			if(guessp3 == targetNumber){
				p3isRight = true;
				winner = "Player 3";
			}
			
			if(p1isRight || p2isRight || p3isRight){
				
				System.out.println("We Have a Winner!!!!");
				System.out.println("The Winner is! "+ winner);
				break;
				System.out.println("Game Over");
				
			} else {
				
				System.out.println("The players need to try again!");
			}
			
			
			
		}
	}
}


class Player{
	
	int number = 0;
	
	public void guess(){
		
		number = (int) (Math.random() * 10);
		System.out.println("I'm Guessing " +number);
	}
}

