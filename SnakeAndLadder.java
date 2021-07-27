package snake_and_ladder;
 
import java.util.Random; 
public class SnakeAndLadder 
{ 
  
		 static final int STARTING_POINT = 0; 
		 static  final int ENDING_POSITION = 100;
		 static final int PLAYER=1; 
		 static final int LADDER = 1; 
		 static final int SNAKE = 2; 
		 static final int NOPLAY = 0; 
		 static Random RANDOM = new Random(); 
 
 
         public int DiceRoll() 
     { 
         int diceNumber = (RANDOM.nextInt(6)+1); 
         System.out.println("Dice number  " +diceNumber); 
         return diceNumber; 
       } 
     	 public void gamePlay() 
   { 
         int playerPosition=STARTING_POINT; 
         
         while (playerPosition<ENDING_POSITION) {
         
         int dice=DiceRoll(); 
         int action = RANDOM.nextInt(3); 
         System.out.println("Action: "+action); 
         switch(action) 
         {  
 
             case LADDER: 
                 playerPosition = playerPosition + dice; 
                     System.out.println("Current ladder position: " + playerPosition); 
                 break; 
             
             case SNAKE: 
                 playerPosition = playerPosition - dice; 
                 if(playerPosition<0){ 
                     playerPosition=STARTING_POINT; 
                 } 
                 System.out.println("Current snake position: "+playerPosition); 
                 break; 
			 
             case NOPLAY: 
                 playerPosition = playerPosition; 
                 if(playerPosition<0){ 
                     playerPosition=STARTING_POINT; 
                 } 
                 System.out.println("No play position: "+playerPosition); 
                 break; 
           }
         } 
     } 
         public static void main(String args[]) 
       { 
         SnakeAndLadder snakeAndLadder=new SnakeAndLadder(); 
         snakeAndLadder.gamePlay(); 
         } 
 
 } 

