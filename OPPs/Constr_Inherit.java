class base1 {

    base1() {
        System.out.println("Hello I am base class constructor");
    }

    base1(int x) {
        System.out.println("I am a overloaded base Constructor with value of X = " + x);
    }

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am base set as X now");
        this.x = x;
    }

}

class derived1 extends base1 {

    derived1() {
        // super(9);
        System.out.println("Hello i am Derived class Constructor");
    }

    derived1(int x, int y) {
        super(x);
        System.out.println("I am a overloaded derived Constructor with value of Y = " + y);
    }

    int Y;

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

}

class ChildOfDerived extends derived1 {
    ChildOfDerived() {
        System.out.println("I am child of ChildOfDerived");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a overloaded derived Constructor with value of Z = " + z);
    }

}

public class Constr_Inherit {
    public static void main(String[] args) {

        // base1 b = new base1();
        // base1 b = new base1(9);
        // derived1 d = new derived1();
        // derived1 d = new derived1(8, 11);
        // ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd = new ChildOfDerived(12,15,18);
        // b.setX(5);
        // System.out.println(b.getX());

        // derived d = new derived();
        // d.setX(8);
        // System.out.println(d.getX());
        // d.setY(8);
        // System.out.println(d.getY());

    }
}
