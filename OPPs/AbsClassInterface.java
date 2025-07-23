interface cycle {
    final int a = 45; // Value can't change once you declaired Or by default is final;

    void applybreak(int decrement);
    void speedup();

}

interface horncycle {
    
    void horncyclemet();

    void horncyclemet2();

}

class herocycle implements cycle, horncycle {
    void blowhorn() {
        System.out.println("PIII PII Poww Pow");

    }

    public void applybreak(int decrement) {
        System.out.println("Apply break");
    }

    public void speedup() {
        System.out.println("Apply SpeedUp");
    }
    public void horncyclemet(){
        System.out.println("I am 2nd interface method");
    }

    public void horncyclemet2(){
        System.out.println("I am 2nd interface method");

    }
}

public class AbsClassInterface {
    public static void main(String[] args) {

        herocycle scy = new herocycle();
        scy.blowhorn();
        scy.applybreak(1);
        scy.speedup();
        // scy.a = 47; value can't change;
        System.out.println(cycle.a);

        scy.horncyclemet();
        scy.horncyclemet2();

    }
}
