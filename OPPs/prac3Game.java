import java.util.Random;
import java.util.Scanner;

class game {
    public int rnumber;
    public int inputnumber;
    public int noOfGuesses;

    public int guessnumber() {
        return noOfGuesses;
    }

    game() {
        Random rand = new Random();
        this.rnumber = rand.nextInt(1);
    }

    void takeUserInput() {
        System.out.println("Guess a number");
        Scanner sc = new Scanner(System.in);
        inputnumber = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputnumber == rnumber) {
            System.out.println("You win! You guess right number");
            System.out.format("Number was %d\nYou guess it in %d attempts", rnumber, noOfGuesses);
            return true;
        } else if (inputnumber < rnumber) {
            System.out.println("Too low\n");
        } else if (inputnumber > rnumber) {
            System.out.println("Too high\n");
        }
        return false;
    }

}

public class prac3Game {

    public static void main(String[] args) {

        game g = new game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            System.out.println(b);

        }
    }
}

// Create a class game, Which allow a user to play "Guess the number" game once.

/*
 * Game should have the following method:
 * 
 * 1. Constructor to generate the random number
 * 2. takeUserInput() to take a use input of number
 * 3. isCorrectNumber() to detect the number entered by the user is true
 * 4. Getter and setter for noOfGuesses
 * use properties such as noOfGuesses(int), etc to geet this take done!
 * 
 */
