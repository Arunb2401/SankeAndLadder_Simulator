package snake_and_ladder;

import java.util.Random;

public class SnakeAndLadder {

	static final int STARTING_POINT = 0;
	static final int ENDING_POSITION = 100;
	static final int PLAYER = 1;
	static final int LADDER = 1;
	static final int SNAKE = 2;
	static final int NOPLAY = 0;
	static String TASK;
	static final int player1Position = 0;
	int totalDiceCount = 0;
	static Random RANDOM = new Random();

	public int rollDice() {
		int diceNumber = (RANDOM.nextInt(6) + 1);
		System.out.println("Dice number  " + diceNumber);
		totalDiceCount++;
		System.out.println("totalDiceCount " + totalDiceCount);

		return diceNumber;
	}

	public int playGame(int currentPosition, int DiceCount) {
		if (currentPosition < 100) {
			int DICE = (RANDOM.nextInt(6) + 1);

			int action = RANDOM.nextInt(3);
			System.out.println("Action: " + action);
			switch (action) {

			case LADDER:
				if (currentPosition + DICE <= 100) {
					currentPosition = currentPosition + DICE;
					TASK = "Ladder";
				}
				break;
			case SNAKE:
				if (currentPosition - DICE >= 0) {
					currentPosition = currentPosition - DICE;
					TASK = "Snake";
				}
				System.out.println("Current snake position: " + player1Position);
				break;

			case NOPLAY:
				currentPosition = currentPosition;
				TASK = "noPlay";
				break;
			}
			System.out
					.println(" | Dice: " + DICE + " for " + TASK + " and Current Position : " + currentPosition + "| ");
		}
		if (TASK == "Ladder" && currentPosition != 100) {
			DiceCount = dice_Player(DiceCount);
			playGame(currentPosition, DiceCount);
		}
		return currentPosition;
	}

	public int dice_Player(int diceCount) {
		diceCount++;
		return diceCount;
	}

	// Game played by two players
	public void TwoPlayers() {
		int Player1position = 0;
		int Player2position = 0;
		int dice_count = 0;
		System.out.println("Game Started by two player");
		while (Player1position < 100 && Player2position < 100) {
			System.out.println("Player 1 :-  ");
			Player1position = playGame(Player1position, dice_count);
			dice_count = dice_Player(dice_count);
			System.out.println("------------------------------------------------------------------------- ");
			if (Player1position == 100) {
				break;
			}
			System.out.println("Player 2 :-  ");
			Player2position = playGame(Player2position, dice_count);
			dice_count = dice_Player(dice_count);
			System.out.println("------------------------------------------------------------------------- ");
		}
		if (Player1position == 100) {
			System.out.println();
			System.out.println("Player 1 Won The Match ");
		} else if (Player2position == 100) {
			System.out.println();
			System.out.println("Player 2 Won The Match ");
		}
		System.out.println("Total Dice Count of both Players " + dice_count);
	}

	public static void main(String args[]) {
		System.out.println("Welcome to snake and ladder game simulator");
		SnakeAndLadder snakeAndLadder = new SnakeAndLadder();
		snakeAndLadder.TwoPlayers();
	}
}
