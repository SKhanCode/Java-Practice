public class Method_overloading {
    static void sohh() {
        System.out.println("Hello PaaJii Good Eve ning");
    }

    static void sohh(int a) {
        System.out.println("Hello PaaJii " + a + " Good Evening");
    }

    static void sohh(int a, int b) // 'a' and 'b' are parameters...
    {
        System.out.println("Hello PaaJii " + a + " Good Evening " + b + " Good Night");
    }

    public static void main(String args[]) {
        sohh();
        sohh(90);  // 90 is an argument...And argument are actual!...
        sohh(90, 100);

    }
}
