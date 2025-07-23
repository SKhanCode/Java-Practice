import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("You enter is -- \n" + name);

        // 1. name.length --- (it's always count free space)

        int value = name.length();
        System.out.println(value);

        // 2. name.toLowerCase ---

        String InLowCase = name.toLowerCase();
        System.out.println(InLowCase);

        // 3. name.toUpperCase ---

        // String InUpperCase = name.toUpperCase();
        String InUpperCasoe = "hello Pagi";
        String InUpperCase = InUpperCasoe.toUpperCase();
        System.out.println(InUpperCase);

        // 4. name.trim ---

        String Str = "    Hello Sohel  khan@ ";
        String StrTrim = Str.trim();
        System.out.println(StrTrim);
        // 5. name.subString ---

        String Stri = "I am Good boy.";
        String StrTrimi = Stri.substring(2);
        System.out.println(StrTrimi);

        // 6. name.subString ---

        String Strii = "I am Good boy.";
        String StriTrimi = Strii.substring(2, 7);
        System.out.println(StriTrimi);

        // 7. name.replace ---
        String rep = "I am aabbAABB";
        String replcii = rep.replace("a", "b");
        System.out.println(replcii);

        // 8. name.startsWith ---
        String Startai = "Hello i am good";
        System.out.println(Startai.startsWith("Hello"));
        System.out.println(Startai.endsWith("Good"));
        // 9. name.endsWith ---
        String endi = "Hello i am good";
        System.out.println(endi.endsWith("Good"));

        // 10. name.charAt ---
        System.out.println("10...---");
        String Startoo = "Hello i am good";
        char tabbo = Startoo.charAt(4);
        System.out.println(tabbo); /*
                                    * or-->
                                    * System.out.println(Startoo.charAt(4));
                                    */

        // 11. name.indexOf() ---
        System.out.println("11...---");
        String chck = "Hello i am good";
        int chcki = chck.indexOf("l");
        System.out.println(chcki);
        // System.out.println(chck.indexOf("o"));
        
        // 12. name.indexOf(Start from a define number) ---
        System.out.println("12...---");
        String chc = "Hello i am good";
        int chhc = chc.indexOf("l",3);
        System.out.println(chhc);
        // System.out.println(chck.indexOf("o"));
        
        // 13. name.lastIndexOf() ---
        System.out.println("13...---");
        String chca = "Helilo i am good";
        int chhca = chca.lastIndexOf("i");
        System.out.println(chhca);
        
        // 14. name.lastIndexOf(search from a define number) ---
        System.out.println("14...---");
        String chcb = "Hellilo i am good";
        int chhcb = chcb.lastIndexOf("i",12);
        System.out.println(chhcb);
        
        
        // 15. name.equals(Its Count space & Case sensitive) ---
        System.out.println("15...---");
        String chcc = "Hello i am good ";
        boolean chhcc = chcc.equals("Hello i am good ");
        System.out.println(chhcc);
        
        // 16. name.equalsIgoneCase(Its Count space & Case sensitive) ---
        System.out.println("16...---");
        String chcd = "HellO good I Am FREe";
        boolean chhcd = chcd.equalsIgnoreCase("hello gooD i am freE");
        System.out.println(chhcd);
        
    }

}
