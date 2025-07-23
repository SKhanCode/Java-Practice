abstract class parent2 {

    public parent2() {
        System.out.println("Hello i am child class");
    }

    public void ring() {
        System.out.println("Ring");
    }

    abstract public void greet();

    abstract public void greet2();

}

class child1 extends parent2 {

    public void greet() {
        System.out.println("Hello I am child 1 ");
    }

    public void greet2() {
        System.out.println("Hello I am child 1 & Grt2");
    }

    public void chid1() {
        System.out.println("Hello i am child class");
    }

}

abstract class child2 extends parent2 {

    public void haagi() {
        System.out.println("Hello i am child 2");
    }

}

public class Abstract_class {
    public static void main(String[] args) {

        // parent2 pr = new parent2(); -- Not allowed because its abstract class;

        child1 ch1 = new child1();
        ch1.greet();
        ch1.greet2();
        ch1.chid1();

        // child2 ch2 = new child2(); -- Not allowed because its abstract class;

    }
}