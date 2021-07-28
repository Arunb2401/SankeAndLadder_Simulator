package snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {

	static final int STARTING_POINT = 0;
	static final int ENDING_POSITION = 100;
	static final int PLAYER = 1;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static final int player1Position = 0;
	static Random RANDOM = new Random();

	public int rollDice() {
		int diceNumber = (RANDOM.nextInt(6) + 1);
		System.out.println("Dice number  " + diceNumber);
		return diceNumber;
	}

	public void playGame() {
		int player1Position = 0;

		while (player1Position != 100) {

			int dice = rollDice();
			int action = RANDOM.nextInt(3);
			System.out.println("Action: " + action);
			switch (action) {

			case LADDER:
				int limit;
				limit = player1Position;
				limit = limit + dice;
				
			if (limit<= 100) {
				player1Position = player1Position + dice;
				 System.out.println("Current ladder position: " + player1Position);
			}
			break;
			case SNAKE:
				player1Position = player1Position - dice;
				if (player1Position < 0) {
					player1Position = 0;
				}
				System.out.println("Current snake position: " + player1Position);
				break;

			case NOPLAY:
				player1Position = player1Position;
				if (player1Position < 0) {
					player1Position = 0;
				
				System.out.println("No play position: " + player1Position);
				}
				break;
			}
			System.out.println("");}
	}

	public static void main(String args[]) {
		SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
		snakeAndLadder.playGame();
	}
}
