public class Array {

    public static void main(String[] args) {
        // There are three main ways for create a array

        // 1. Declaration + Memory Allocation

        int marks[] = new int[5];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        marks[4] = 50;
        System.out.println("First Way");
        System.out.println(marks[4]);
        System.out.println(marks[0]);

        // 2.--
        int[] roll; // Decleration
                    // And Then
        roll = new int[5];// Memory Allocation
        roll[1] = 20;
        roll[0] = 10;
        roll[2] = 30;
        roll[3] = 40;
        roll[4] = 50;
        System.out.println("\nSecond Way");
        System.out.println(roll[3]);
        System.out.println(roll[2]);

        // 3.--
        System.out.println("\nThird Way");
        int[] salary = { 2, 3, 4, 5, 6 }; // Decleration + initialize
        System.out.println(salary[3]);
        System.out.println(salary[0]);
        System.out.println("\n\n");

        // 4.-- Array with Loop
        System.out.println("Array with loop");
        int ary[] = { 3, 4, 2, 1 };
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);

        }
        System.out.println("\nIn Reverse Order");

        int arry[] = { 3, 4, 2, 1 };
        for (int i = arry.length - 1; i >= 0; i--) {
            System.out.println(arry[i]);

        }
        System.out.println("\nSecond Ways called 'for each' ");
        for (int element : arry) {
            System.out.println(element);
        }

    }

}
