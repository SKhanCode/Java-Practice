import java.util.Scanner;
import java.util.Random;

public class game {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for rock, 1 for papper, 2 for scissor");
        int userinput = sc.nextInt();
        Random random = new Random();
        int ComputerInput = random.nextInt(3);
        if (userinput == ComputerInput) {
            System.out.println("Draw");

        } else if (userinput == 0 && ComputerInput == 2 || userinput == 1 && ComputerInput == 0
                || userinput == 2 && ComputerInput == 1) {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Computer Win");
        }
        System.out.println("Computer Choice "+ ComputerInput);

    }

}
