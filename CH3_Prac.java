// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class CH3_Prac {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Question 1");
        String name = "Hello KhanSaab";
        String ToLowerCase = name.toLowerCase();
        System.out.println(ToLowerCase);

        System.out.println("Question 2");
        System.out.println("Enter some space for convert in to \\"); 
        String Name2 = sc.nextLine();     
        String name3 = "Hello  Khan  Saab";
        String Replace2 = Name2.replace(" ", "\\");
        String Replace3 = name3.replace(" ", "\\");
        System.out.println(Replace2);
        System.out.println(Replace3);
        System.out.println(name3.replace( " ", "\\") );

        System.out.println("Question 3");
        String namee = "Dear <|name|>, thanks for money";
        namee = namee.replace("<|name|>", "Sohel");
        System.out.println(namee);

        System.out.println("Question 4");
        String name4 = "hello I  am   Groot";
        System.out.println(name4.indexOf("  "));
        System.out.println(name4.indexOf("   "));

        System.out.println("Question 5");
        String name5 = "Hello Sohel Khan,\n\t How are you?\ni am Good";
    System.out.println(name5);
    }    
}
