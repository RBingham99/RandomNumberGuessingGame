import java.util.Scanner;

public class RandomNumberGuesser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain){
            int randomNum =(int)(Math.random() * 10 + 1);
            System.out.println("We have generated a random number between 1 and 10");
            System.out.println("Please type your guess");
            int guess = input.nextInt();
            while (guess != randomNum){
                if (guess < 1 || guess > 10){
                    System.out.println("The number is between 1 and 10");
                    System.out.println("Please guess again");
                } else {
                    System.out.println("Sorry that's incorrect");
                    System.out.println("Please guess again");
                }
                guess = input.nextInt();
            }
            System.out.println("Correct!");
            System.out.println("Would you like to play again?");
            System.out.println("yes/no");
            boolean validInput = true;
            boolean firstTry = true;
            while (!validInput || firstTry) {
                firstTry = false;
                String playAgainInput = input.next();
                playAgainInput = playAgainInput.toLowerCase();
                if (playAgainInput.equals("no") || playAgainInput.equals("n")) {
                    playAgain = false;
                    validInput = true;
                    System.out.println("Thank you for playing!");
                } else if (!playAgainInput.equals("yes") && !playAgainInput.equals("y")) {
                    System.out.println("I'm sorry, that is not a recognised answer");
                    System.out.println("Please try again");
                    validInput = false;
                } else {
                    validInput = true;
                }
            }
        }

    }
}
