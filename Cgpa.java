import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject 1 Marks = ");
        float Sub1 = sc.nextFloat();
        System.out.print("Enter Subject 2 Marks = ");
        float Sub2 = sc.nextFloat();
        System.out.print("Enter Subject 3 Marks = ");
        float Sub3 = sc.nextFloat();
        System.out.print("Enter Subject 4 Marks = ");
        float Sub4 = sc.nextFloat();
        System.out.print("Enter Subject 5 Marks = ");
        float Sub5 = sc.nextFloat();
        float TotalMarks = (Sub1 + Sub2 + Sub3 + Sub4 + Sub5);
        System.out.print("Total marks is = ");
        System.out.println(TotalMarks);
        System.out.println();
        float cgpa = TotalMarks / 50;
        System.out.println(cgpa);
        
    }
}
