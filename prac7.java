// import java.util.Scanner;

// public class prac7 {

//     static int table(int n) {
//         int t = 0;
//         for (int i = 1; i <= 10; i++) {
//             t = n * i;
//             System.out.println(t);

//         }
//         return t;
//     }

//     public static void main(String[] args){
//         System.out.println("Enter any number for table");
//         Scanner sc = new Scanner(System.in);
//         int j = sc.nextInt();
//         System.out.println(table(j));
//             }

// }

// 2....
// import java.util.Scanner;

// public class prac7 {

//     static int star(int n) {
//         int t = 0;
//         for (int i = 0; i <= n; i++) {
//             for (int j = 0; j < i; j++) {

//                 System.out.print("*");

//             }
//             System.out.print("\n");

//         }
//         return 0;

//     }

//     public static void main(String[] args) {
//         star(10);
//         }

// }
// 3........
// import java.util.Scanner;

// public class prac7 {

//     static int recurSum(int n) {

//         return n + recurSum(n-1);
//         }

//     public static void main(String[] args) {
//         recurSum(13);
//         }

// }

// 4......
// import java.util.Scanner;

// public class prac7 {

//     static int recurSum(int n) {
//         if (n==1) {
//             return 1;

//         }
//         return n + recurSum(n-1);
//         }

//     public static void main(String[] args) {
//         System.out.println(recurSum(4));
//         }

// }
// 5....
// import java.util.Scanner;

// public class prac7 {

//     static int star(int n) {

//         for (int i = n; i >= 0; i--) {
//             for (int j = 0; j < i; j++) {

//                 System.out.print("*");

//             }
//             System.out.print("\n");

//         }
//         return 0;

//     }

//     public static void main(String[] args) {
//         star(5);
//         }

// }

// 6....   
// import java.util.Scanner;

// public class prac7 {

//     static int fib(int n) {

//         if (n == 1 || n == 2) {
//             return n-1;

//         }
//         return fib(n-1) + fib(n-2);

//     }

//     public static void main(String[] args) {
        
//         System.out.println(fib(8));
//     }

// }
// 6....
import java.util.Scanner;

public class prac7 {

    static int fib(int n) {

        if (n == 1 || n == 2) {
            return n-1;

        }
        return fib(n-1) + fib(n-2);

    }

    public static void main(String[] args) {
        
        System.out.println(fib(8));
    }

}
