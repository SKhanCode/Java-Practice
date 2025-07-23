class cylinder {
    private int radius;
    private int height;

    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }

    public int getheight() {
        return height;
    }

    public void setheight(int h) {
        height = h;
    }

    // Answer 2...
    public double surfacearea() {
        return 2 * 3.142 * radius * radius + 2 * 3.142 * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    // Answer 3...
    public cylinder(int r, int h) {
        radius = r;
        height = h;
    }
}

// Answer 4...
class rectangle {
    private int length;
    private int breadth;
    
    public rectangle(int l, int b){
        length = l;
        breadth = b;

    }

    public int getlength() {
            return length;
    }
    public void setlength(int l){
        length = l;
    }
    public int getbreadth() {
            return breadth;
    }
    public void setbreadth(int b){
        breadth = b;
    }
}

// Answer 5...
class sphere {
    private int radius;
    
    public int getradius() {
        return radius;
    }

    public void setradius(int r) {
        radius = r;
    }
    public double surfacearea() {
        return 4 * 3.142 * radius * radius;
    }

    public double volume() {        
        return (4 * 3.142 * radius * radius * radius)/3;
    }
}
public class prac9 {
    public static void main(String[] args) {

        // Question 1...
        // cylinder consi = new cylinder();
        // consi.setradius(5);
        // consi.setheight(8);
        // System.out.println("Radius is "+ consi.getradius());
        // System.out.println("Height is "+ consi.getheight());

        // Answer 2...
        // cylinder consi = new cylinder();
        // consi.setradius(7);
        // consi.setheight(9);
        // System.out.println("Radius is " + consi.getradius());
        // System.out.println("Height is " + consi.getheight());
        // System.out.println("Suraface area is = " + consi.surfacearea());
        // System.out.println("Volume is = " + consi.volume());

        // Answer 3...
        // cylinder consi = new cylinder();
        // cylinder consi = new cylinder(7, 9);
        // System.out.println("Radius is " + consi.getradius());
        // System.out.println("Height is " + consi.getheight());
        // System.out.println("Suraface area is = " + consi.surfacearea());
        // System.out.println("Volume is = " + consi.volume());


        // Answer 4...
        // rectangle consi = new rectangle(7,9);
        // System.out.println("Length is "+ consi.getlength());
        // System.out.println("Breadth is "+consi.getbreadth());
    
        // Answer 5...
        sphere cons = new sphere();
        cons.setradius(7);
        System.out.println("Radius is " + cons.getradius());
        System.out.println("Suraface area is = " + cons.surfacearea());
        System.out.println("Volume is = " + cons.volume());

        

    }

}
