import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        System.out.println("Enter a number for his tables: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;


        
        // for loop ---
        for (i = 1; i <= 10; i++) {

            int tab = num * i;
            System.out.println(tab);
        }


        
        // 2.while loop ---
        // System.out.println("Enter second num");
        // int num = sc.nextInt();
        // while (i <= 10) {
        // int tab = num * i;
        // System.out.println(tab);
        // i++;
        // }


        // 3.do while loop ---

        // do{
        // int tab = num * i;
        // System.out.println(tab);
        // i++;
        // }while(i <= 10);

    }
}