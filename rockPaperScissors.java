import java.util.*;

public class rockPaperScissors { //public class of same name
    public static void main(String[] args) { //main() method}
        Scanner scanner = new Scanner(System.in); //declare scanner object for user input
    //Decoreate the program
        System.out.println("|||||||||||||||||||||||||||||||||||||"); //Print boundary
        System.out.println("|-Let's play Rock, Paper, Scissors!-|"); //Welcome player message
    //Ask for user input
      //  System.out.println("|||||||||||||||||||||||||||||||||||||"); //Print boundary
        System.out.println(" ||Rock, Paper, Scissors, Shoot!||"); //Make call to enter choice
        String playerChoice = scanner.nextLine(); //Store the okayers move}
    //Get computer move by random number selection

    Random random = new Random(); //Declare random object
    int computerChoice = random.nextInt(3); //Store the computers move in an int variable of random number between 0 and 2

    //Print the cmputer move vs the players move, show based on conditions
   String computerMove = "";

    if (computerChoice == 0){
        computerMove = "Rock";
    }
    else if (computerChoice == 1){
        computerMove = "Paper";
    }
    else if (computerChoice == 2){
        computerMove = "Scissors";
    }
    //Print the versus and the winner
    System.out.println("|||||||||||||||||||||||||||||||||||||"); //Print boundary
    System.out.println("||" + playerChoice + " - VERSUS - " + computerMove + "||");

    //player wins method

    if (computerMove.equals(playerChoice) ){
        System.out.println("Tied!");
    }
    else if (playerWins(playerChoice, computerMove)){
        System.out.println("Nice, you win!");
    }
    else {
        System.out.println("You lose!");
    }

    // else if (computerMove )
    }
    static boolean playerWins(String playerChoice, String computerMove){
        if (playerChoice.equals("Rock")){
            if (computerMove.equals("Scissors")){
                return true;
            }
        }
        else if (playerChoice.equals("Paper")){
            if (computerMove.equals("Rock")){
                return true;
            }
         }
        else if (playerChoice. equals("Scissors")){
            if (computerMove == "Paper"){
                return true;
            }
        }
        return false;
    }

    
}