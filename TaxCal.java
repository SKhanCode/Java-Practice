import java.util.Scanner;

public class TaxCal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the income:");
        double income = sc.nextDouble();
        if (income <= 250000) {
            System.out.println(("No Tax"));
        } else if (income > 250000 && income <= 500000) {
            double tax = (income / 100) * 5;
            System.out.println(tax);
        } else if (income > 500000 && income <= 1000000) {
            double tax = (income / 100) * 20;
            System.out.println(tax);
        } else if (income > 1000000) {
            double tax = (income / 100) * 30;
            System.out.println(tax);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
