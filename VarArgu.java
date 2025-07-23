public class VarArgu {

    // static int sum(int a, int b) {
    // return a + b;

    // }
    //First Ways:---
    // static int sum(int ...a) {
    //     int result = 0;
    //     for (int i = 0; i < a.length; i++) {
    //         result += a[i];
    //     }
    //     return result;
    // }
    //Second ways:---

    static int sum(int ...arr) {
        int result = 0;
        for (int a: arr) {
            result += a;
        } 
        return result;
    }

    public static void main(String args[]) {

        System.out.println("Sum is: " + sum(7, 10));
        System.out.println("Sum is: " + sum(7, 10, 10));
        System.out.println("Sum is: " + sum(7, 10, 10, 10));
        System.out.println("Sum is: " + sum(7, 10, 10, 10, 10));

    }
}
