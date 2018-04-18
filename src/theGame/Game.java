package theGame;

import java.util.Scanner;

public class Game {
	Player runner = new Player();
	Scanner kb = new Scanner(System.in);

	public void askPlayer() {
		System.out.println("You are in position " + runner.getRank() + ".");
		System.out.println("Do you want to run? If you say \"N\", then you use one of " + runner.getRests() + " rests. Y/N");
		String userAnswer = kb.nextLine();

		while (!userAnswer.equals("Y") || !userAnswer.equals("N")) {
			if (userAnswer.equals("Y")) {
				runner.run();
				break;
			}
			else if (userAnswer.equals("N")) {
				runner.dontRun();
				break;
			}
			else {
				System.out.println("That was not an option. Enter in initials.");
			}
			userAnswer = kb.next();
		}
	}
	
	public int gameOver() {
		return runner.getHealth();
	}
	
	public int win() {
		return runner.getDistance();
	}
	
	public int position() {
		return runner.getRank();
	}
}
