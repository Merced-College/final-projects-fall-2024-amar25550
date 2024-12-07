import java.util.Random;
import java.util.Scanner;

public class FinalProj {
  public static void main(String[] args) {  
    
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
      String[] rps = {"rock", "paper", "scissors"}; //Apart of 1st ALGORITHM
      String computerMove = rps[new Random().nextInt(rps.length)]; //Apart of 1st ALGORITHM
      
      String playerMove;
      
      while(true) {
        System.out.println("Please enter your move (rock, paper, or scissors)");
        playerMove = scanner.nextLine();
        if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
          break;
        }
        System.out.println(playerMove + " is not a valid word.");
      }
      
      System.out.println("Computer played: " + computerMove);
      
      if (playerMove.equals(computerMove)) {  //End of Game Decision Algorithm (2ND) starts here
        System.out.println("The game was a tie!!");
      }
      else if (playerMove.equals("rock")) {
        if (computerMove.equals("paper")) {
          System.out.println("You lost :(");
          
        } else if (computerMove.equals("scissors")) {
          System.out.println("You win!! :) ");
        }
      }
      
      else if (playerMove.equals("paper")) {
        if (computerMove.equals("rock")) {
          System.out.println("You win!! :)");
          
        } else if (computerMove.equals("scissors")) {
          System.out.println("You lost :(");
        }
      }
      
      else if (playerMove.equals("scissors")) {
        if (computerMove.equals("paper")) {
          System.out.println("You win!! :)");
          
        } else if (computerMove.equals("rock")) {
          System.out.println("You lost :(");
        }
      } //End of Game Decision Algorithm (2ND) ends here
      
      System.out.println("Play again? type either: (yes/no)");// Play again question (3RD) Algorithm starts here
      String playAgain = scanner.nextLine();
      
      if (!playAgain.equals("yes")) {
        break;
      } // Play again question (3RD) Algorithm ends here
    }
    scanner.close();
  }
}
;
