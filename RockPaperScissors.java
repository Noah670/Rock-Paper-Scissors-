import java.util.Random;
import java.util.Scanner;

// rock paper scicssors
import java.util.Scanner;
import java.math.*;

public class RockPaperScissors {

  public static void main(String[] args) {
    System.out.println("Welcome to Rock, Paper, Scissors");
    System.out.println("Enter 'y' to start or 'n' to quit");

    Scanner userInput = new Scanner(System.in);
    String userChoice = "sentinal";

    // create player Object

    RockPaperScissors player = new RockPaperScissors();

    int userHighScore = 0;
    System.out.println("Starting Rock Paper Scissors game");
    do {
      userChoice = userInput.nextLine();
      if (userChoice.equalsIgnoreCase("y")) {
        player.playGame();
        player.playAgain();
      } else if (userChoice.equalsIgnoreCase("n")) {
        System.out.println("Exiting game...");
      } else {

        System.out.println("Invalid option selected!");
        System.out.println("Please enter 'y' to start or 'n' to quit!");
      }
    } while (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n"));

  }

  public int playGame() {
    System.out.println("Choose your weapon!");
    System.out.println("Select 'r' for Rock, 'p' for Paper, or 's' for Scissors");
    Scanner playerInput = new Scanner(System.in);

    String[] enemyWeapons = { "rock", "paper", "scissors" };

    // Record the highscore of the total amount of player wins
    int playerWins = 0;

    int index = new Random().nextInt(enemyWeapons.length);
    String randomWeapon = (enemyWeapons[index]);
    // View CPU weapons for debug purposes
    //System.out.println("This weapon is " + randomWeapon);

    String weaponChoice = "sentinal";

    do {

      weaponChoice = playerInput.nextLine();
      if (weaponChoice.equalsIgnoreCase("r")) {
        System.out.println("Rock vs " + randomWeapon);
        if (randomWeapon.contains("rock")) {
          System.out.println("You tied!");
        } else if (randomWeapon.contains("paper")) {
          System.out.println("You lost!");
        } else if (randomWeapon.contains("scissors")) {
          System.out.println("You won!");
          // add player win
          playerWins++;
        }

      } else if (weaponChoice.equalsIgnoreCase("p")) {
        System.out.println("Paper vs " + randomWeapon);

        if (randomWeapon.contains("rock")) {
          System.out.println("You won!");
          playerWins++;
        } else if (randomWeapon.contains("paper")) {
          System.out.println("You tied!");
        } else if (randomWeapon.contains("scissors")) {
          System.out.println("You lost!");
        }

      } else if (weaponChoice.equalsIgnoreCase("s")) {
        System.out.println("Scissors vs " + randomWeapon);

        if (randomWeapon.contains("rock")) {
          System.out.println("You lost!");
        } else if (randomWeapon.contains("paper")) {
          System.out.println("You won!");
          playerWins++;
        } else if (randomWeapon.contains("scissors")) {
          System.out.println("You tied!");
        }
      }

    } while (weaponChoice.equalsIgnoreCase("r") && weaponChoice.equalsIgnoreCase("p")
        && weaponChoice.equalsIgnoreCase("s"));

    return playerWins;
  }

  public int playAgain() {
    System.out.println("Would you like to play again?");
    System.out.println("Enter 'y' to play again or 'n' to quit");

    Scanner playAgain = new Scanner(System.in);
    String playerChoice = "sentinal";
    RockPaperScissors anotherGame = new RockPaperScissors();
    int totalGamesPlayed = 0;

    do {
      playerChoice = playAgain.nextLine();
      if (playerChoice.equalsIgnoreCase("y")) {
        System.out.println("Play again!");
        totalGamesPlayed++;
        anotherGame.playGame();

      } else if (playerChoice.equalsIgnoreCase("n")) {
        System.out.println("Exiting game...");
      } else {
        System.out.println("Invalid option selected!");
        System.out.println("Please enter 'y' to start or 'n' to quit!");
      }

    } while (!playerChoice.equalsIgnoreCase("y") && !playerChoice.equalsIgnoreCase("n"));

    return totalGamesPlayed;

  }

}