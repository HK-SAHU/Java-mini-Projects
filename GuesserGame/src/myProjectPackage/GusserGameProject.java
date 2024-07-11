package myProjectPackage;
import java.util.Scanner;

class Guesser{
	int guesserNum;
	public int takeNumberGuesser(){
		System.out.println("Guesser Guess the number:");
		Scanner sc= new Scanner(System.in);
		guesserNum= sc.nextInt();
		return guesserNum;
	}
}

class Player{
	int playerNum;
	public int takeNumberPlayer(){
		System.out.println("Player Guess the number:");
		Scanner sc= new Scanner(System.in);
		playerNum= sc.nextInt();
		return playerNum;
	}
}

class Umpire{
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;
	void collectFromGuesser() {
		Guesser g= new Guesser();
		numberFromGuesser=g.takeNumberGuesser();
	}
	
	void collectFromPLayer() {
		Player p1= new Player();
		numberFromPlayer1= p1.takeNumberPlayer();
		
		Player p2= new Player();
		numberFromPlayer2= p2.takeNumberPlayer();
		
		Player p3= new Player();
		numberFromPlayer3= p3.takeNumberPlayer();
	}
	
	void compare() {
		if(numberFromPlayer1==numberFromGuesser) {
			if(numberFromPlayer2==numberFromGuesser && numberFromPlayer3==numberFromGuesser) {
				System.out.println("All Players won the game");
			}
			else if(numberFromPlayer2==numberFromGuesser) {
				System.out.println("Only Player1 and Player2 won the game");
			}
		
			else if(numberFromPlayer3==numberFromGuesser) {
				System.out.println("Only Player1 and Player3 won the game");
			}
			else {
			System.out.println("Only player1 has won the game");
			}
		}
		else if(numberFromPlayer2==numberFromGuesser){
			if(numberFromPlayer3==numberFromGuesser) {
				System.out.println("Only player2 and player3 won the game");
			}
			else {
				System.out.println("Only player2 won the game");
			}
		}
		else if(numberFromPlayer3==numberFromGuesser){
			System.out.println("Only Player3 has won the game");
		}
		else {
			System.out.println("No Player won the game");
		}
	}
}


public class GusserGameProject {

	public static void main(String[] args) {
		Umpire u= new Umpire();
		u.collectFromGuesser();
		u.collectFromPLayer();
		u.compare();

	}

}
