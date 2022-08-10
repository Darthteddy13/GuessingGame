import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Game();

    }

    public static void Game()
    {
        System.out.println("Hello, there.");

        Scanner scan = new Scanner(System.in);


        int randNum = (int) (Math.random() * 100) + 1;

        int guessInt = 0;

        do
        {
            System.out.println("Guess a number between 1 and 100");

            String guess = scan.nextLine();
            guessInt = Integer.parseInt(guess);
            if(guessInt > randNum)
                System.out.println("Your guess is too high");
            else if(guessInt < randNum)
                System.out.println("Your guess is too low");
            else
                System.out.println("You guessed correctly!");


        }while(guessInt != randNum);
    }

    static void compGame()
    {
        System.out.println();

    }


}