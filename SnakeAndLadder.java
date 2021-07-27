package snake_and_ladder;

import java.util.Random; 
 
	  public class SnakeAndLadder { 
 
 
      static final int STARTING_POSITION = 0; 
	  static final int PLAYER=1; 
	  static Random RANDOM = new Random(); 

 
       //uc2 rolling a random value to the player 
       public void diceRoll() 
       { 
           int DICE = (RANDOM.nextInt(6)+1); 
           System.out.println("dice number  " +DICE); 
       } 
   
 
       public static void main(String args[]) 
       { 
           SnakeAndLadder snakeAndLadder=new SnakeAndLadder(); 
          snakeAndLadder.diceRoll(); 
      } 
}

