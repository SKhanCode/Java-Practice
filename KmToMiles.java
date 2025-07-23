import java.util.Scanner;

public class KmToMiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 For KM to Miles");
        System.out.println("Enter 2 For Miles to KM");
        short value = sc.nextShort();

        if (value == 1) {
            System.out.print("Enter KM = ");
            double km = sc.nextDouble();
            double Miles = km * 0.62137119;
            System.out.println(km + " Km in miles is = " + Miles);

        } else if (value == 2) {
            System.out.print("Enter Miles = ");
            double Miles = sc.nextDouble();
            double KM = Miles / 0.62137119;
            System.out.println(Miles + " Miles in KM is = " + KM);

        } else {
            System.out.println("Invalid Input!");
        }

    }

}
