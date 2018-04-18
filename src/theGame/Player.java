package theGame;

public class Player {
	// You start the race with 100 health.
	private int health = 100;
	private int distance = 10;
	private int rests = 3;
	private int rank = 1;

	// You call run() method four times.
	// Health goes down each time you run.
	public void run() {
		health = health - (int) ((Math.random() * 20) + 20);
		distance = distance - (int) ((Math.random() * 4) + 2);

		if (health <= 0) {
			System.out.println("You ran out of health!");
			System.out.println("YOU LOSE!");
		}
		else {
			System.out.println("You have " + health + " health points left.");

			if (distance <= 0) {
				System.out.println("You ran the ten miles!");
				System.out.println("YOU WIN!");
			}
			else {
				System.out.println("You have " + distance + " miles left.");
			}
		}
	}
	
	public int getRank() {
		return rank;
	}

	public int getRests() {
		return rests;
	}

	public int getHealth() {
		return health;
	}

	public int getDistance() {
		return distance;
	}

	public void dontRun() {
		if (rests == 0) {
			System.out.println("You have no more rests, you must run!");
		}
		else {
			rests -= 1;
			rank += 1;
			health += 10;
			System.out.println("You have " + health + " health points left.");
		}
	}
}
