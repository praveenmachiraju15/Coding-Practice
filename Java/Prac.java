public class GuessGame{
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
			
			
			
			
		}
	}
}