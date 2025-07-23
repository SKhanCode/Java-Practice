class base {

    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am base set as X now");
        this.x = x;
    }

    public void printme(){
        System.out.println("Hello i am constructor");

    }

}

class derived extends base{
    int Y;

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    }

    public void printme(){
        System.out.println("Hello I am constructor");

    }

}



public class Inheritance {
    public static void main(String[] args) {

        base b = new base();
        b.setX(5);
        System.out.println(b.getX());
        
        derived d = new derived();
        d.setX(8);
        System.out.println(d.getX());
        d.setY(8);
        System.out.println(d.getY());
        
    }
}