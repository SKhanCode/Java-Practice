import java.util.Scanner;

public class LoopPrac {
    public static void main(String[] args) {
        // Q.1--
        // int n = 4;
        // for (int i = n; i > 0; i--) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("*");

        // }
        // System.out.print("\n");
        // }

        // }

        // Reverse--
        // for (int i = 1; i <= 5; i++) {
        // for(int j=1;j<=i;j++){
        // System.out.print("*");
        // }
        // System.out.print("\n");
        // }

        // Q.freemind--5 number sum;
        // int n=5;
        // int k=0;
        // Scanner sc = new Scanner(System.in);

        // for(int i=0; i<n;i++ ){
        // int j = sc.nextInt();
        // k=k+j ;
        // }
        // System.out.println(k);

        // Q.2---
        // int k = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number for even Sum");
        // int n = 6;
        // // int n = sc.nextInt();

        // for (int i = 0; i < n; i++) {

        // k = k + (2*i);
        // }
        // System.out.println(k);

        // Q.3--
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number for it's table ");
        // int n = sc.nextInt();
        // for (int i = 1; i <= 10; i++) {
        // int table = n * i;
        // System.out.println(table);
        // System.out.printf("%d X %d = %d\n",n,i,n*i);
        // }

        // Q.4--
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number for it's table ");
        // int n = sc.nextInt();
        // for (int i = 10; i >= 1; i--) {
        // int table = n * i;
        // System.out.println(table);
        // }

        // Q.5--
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number for it's factorial ");
        // int n = sc.nextInt();
        // int fact = 1;

        // for (int i = 2; i <= n; i++) {
        // fact = fact * i;

        // }
        // System.out.println(fact);

        // Q.6---
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number ");
        // int n = sc.nextInt();
        // int fact = 1;
        // int i = 2;
        // while (i <= n) {
        //     fact = fact * i;
        //     i++;

        // }
        // System.out.println(fact);

        // Q.7--
        // int n=4;
        // int i =4;
        // while (i>0) {
        //     int j=0;
        //     while (j<i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.print("\n");
        //     i--;
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for it's table ");
        int n = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= 10; i++) {
        int table = n * i;
        sum = sum + table;
        
    }
    System.out.println(sum);


    }

}
