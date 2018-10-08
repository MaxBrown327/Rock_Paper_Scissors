import java.util.Scanner;

public class Rock_Paper_Scissors {

    public static void main(String[]args) {

        int numberOfTrys;
        int systemNumber;
        int playerChoice;
        boolean playAgain;
        boolean wonGame;
        Scanner keyboard = new Scanner(System.in);

        playAgain = false;



        //The Actual Game\\
        while (playAgain==false) {

            wonGame = false;
            numberOfTrys = 5;


            systemNumber = (int) (Math.random() * 100);
            System.out.println("Welcome to a game of Rock paper scissors!");
            System.out.println("Try and beat the game!");

            while (!wonGame && numberOfTrys > 0) {
                System.out.println("Pick Rock (1) Paper (2) or Scissors (3)");
                playerChoice = keyboard.nextInt();

                if (systemNumber >34 && playerChoice> 34) {

                }

            }

        }




    }
}
