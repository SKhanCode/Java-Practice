
class myemployee {
     int id;
     String name;

    

    public void printdetails() {
        System.out.println("sohlii");
        System.out.println("kxjn");
    }

    public void displayDetails() {
        System.out.println("sohrl");
        System.out.println("kxjn");
    }
}

public class Check {

    public static void main(String[] args) {
        myemployee sohel = new myemployee();

        sohel.id = 90;
        sohel.name = "Sohel_Khan";
    //   / sohel.setid(90);
    //     System.out.println(sohel.getid());
        System.out.println("Id " + sohel.id);
        System.out.println("Name " + sohel.name);

        sohel.printdetails();
        sohel.displayDetails();

    }
}







// import java.util.Scanner;

// public class Check {
//     public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your subject marks");
        // System.out.println("Enter Your marks in Hindi Sub = ");
        // float Hindi = sc.nextFloat();
        // System.out.println("Enter Your marks in English Sub = ");
        // float English = sc.nextFloat();
        // System.out.println("Enter Your marks in Math Sub = ");
        // float Math = sc.nextFloat();
        // System.out.println("Enter Your marks in Science Sub = ");
        // float Science = sc.nextFloat();
        // System.out.println("Enter Your marks in Art Sub = ");
        // float Art = sc.nextFloat();

        // double TotalMarks = Hindi + English + Math + Science + Art;
        // System.out.print("Total Marks is ");
        // System.out.println(TotalMarks);

        // double percent = (TotalMarks / 500) * 100;
        // System.out.println(percent);

        // if (percent <= 100 && percent >= 90) {
        // System.out.println("Grade S");
        // } else if (percent < 90 && percent >= 80) {
        // System.out.println("Grade A");
        // } else if (percent < 80 && percent >= 70) {
        // System.out.println("Grade B");
        // } else if (percent < 70 && percent >= 60) {
        // System.out.println("Grade C");
        // } else if (percent < 60 && percent >= 50) {
        // System.out.println("Grade D");
        // } else if (percent < 50 && percent >= 33) {
        // System.out.println("Grade E ");
        // } else if (percent < 33 && percent >= 0) {
        // System.out.println("Grade F");
        // } else
        // System.out.println("Enter Valid marks");

//         int arry[] = { 3, 4, 2, 1 };
//         for (int i = arry.length - 1; i <= 0; i--) {
//             System.out.println(arry[i]);

//         }
//         System.out.println(arry);

//     }
// }
