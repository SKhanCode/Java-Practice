import java.util.Scanner;

class employee {
    int id;
    int salary;
    String name;

    public void printdetails() {
        System.out.println("My Id is " + id);
        System.out.println("My salary is " + salary);
        System.out.println("My name is " + name);

    }
}

public class Ownclass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        employee Sohel = new employee(); // Intantiating a new Employee Object
        employee Ahesan = new employee(); // Intantiating a new Employee Object

        // Setting the attributes For Sohel:---
        Sohel.id = 1280;
        Sohel.salary = 250;
        Sohel.name = "Sohel_Khan";

        // Setting the attributes for Ahesan:---
        Ahesan.id = 1520;
        Ahesan.salary = 50;
        Ahesan.name = "Ahesan_siddique";

        // Printing the attributes:---
        Sohel.printdetails();
        Ahesan.printdetails();

        // System.out.println(Sohel.id);
        // System.out.println(Sohel.name);

    }
}
