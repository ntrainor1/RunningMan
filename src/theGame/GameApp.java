package theGame;

public class GameApp {

	public static void main(String[] args) {

		Game game = new Game();

		System.out.println("You are a runner running to win a race on the track.");
		System.out.println("You have ten miles and 100 health points.");
		System.out.println("You can rest, but you will lose your position.");
		System.out.println("Each lap will deduct health points.");
		System.out.println();
		while (game.gameOver() > 0 && game.win() > 0) {
			game.askPlayer();
		}

	}

}
