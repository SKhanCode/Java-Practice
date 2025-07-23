import java.util.Scanner;

public class CH_4_Prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First subject number:");
        int sub1 = sc.nextInt();
        System.out.println("Enter Second subject number:");
        int sub2 = sc.nextInt();
        System.out.println("Enter Third subject number:");
        int sub3 = sc.nextInt();
        float total = sub1 + sub2 + sub3;
        System.out.println("Total marks: " + total);
        float percentage = (total / 300 * 100);
        System.out.println("Percentage: " + percentage);

        if (sub1 < 33 || sub2 < 33 || sub3 < 33) {
            System.out.println("You are fail because you have less than 33% in one or more of the subject");
        }
        
        else  if (percentage >= 40) {
            System.out.println("You are pass");

        } 
        
        else if (percentage < 40) {
            System.out.println("You are fail");

        } 

        }

    }

