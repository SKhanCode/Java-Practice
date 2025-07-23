// Answer 1 :---
/*class circle {

    public int radius;

    circle() {
        System.out.println("I am non param of circle");
    }

    circle(int r) {
        System.out.println("I am circle parametrized construtor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
}

class cylinder1 extends circle {
    public int height;

    cylinder1(int r, int h) {
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * height;

    }

}

public class Prac_CH_10 {

    public static void main(String[] args) {
        circle objcir = new circle(4);
        System.out.println(objcir.area());
        
        cylinder1 objc = new cylinder1(4, 8);
        System.out.println(objc.volume());
    }
}

*/
//  Answer 2 :---

// Base Class: Rectangle
// class Rectangle {
//     private int length;
//     private int width;

//     // Constructor
//     Rectangle(int length, int width) {
//         this.length = length;
//         this.width = width;
//     }

//     // Getter methods
//     public int getLength() {
//         return length;
//     }

//     public int getWidth() {
//         return width;
//     }

//     // Method to calculate area
//     public int area() {
//         return length * width;
//     }
// }

// // Derived Class: Cuboid (Inheriting from Rectangle)
// class Cuboid extends Rectangle {
//     private int height;

//     // Constructor (Calling Parent Constructor)
//     Cuboid(int length, int width, int height) {
//         super(length, width);  // Calls Rectangle Constructor
//         this.height = height;
//     }

//     // Method to calculate volume
//     public int volume() {
//         return getLength() * getWidth() * height;
//     }

//     // Method to calculate surface area
//     public int surfaceArea() {
//         return 2 * (getLength() * getWidth() + getWidth() * height + height * getLength());
//     }
// }

// // Main Class
// public class Prac_CH_10 {
//     public static void main(String[] args) {
//         // Creating Rectangle Object
//         Rectangle rect = new Rectangle(4, 3);
//         System.out.println("Rectangle Area: " + rect.area());

//         // Creating Cuboid Object
//         Cuboid cuboid = new Cuboid(4, 3, 5);
//         System.out.println("Cuboid Volume: " + cuboid.volume());
//         System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
//     }
// }

//Answer 3 -- 
// Already implement in Answer 1;

//Answer 4 -- 
// Base Class: Rectangle
class Rectangle {
    private int length;
    private int width;

    // Constructor
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Setter methods
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Method to calculate area
    public int area() {
        return length * width;
    }
}

// Derived Class: Cuboid (Inheriting from Rectangle)
class Cuboid extends Rectangle {
    private int height;

    // Constructor (Calling Parent Constructor)
    Cuboid(int length, int width, int height) {
        super(length, width);  // Calls Rectangle Constructor
        this.height = height;
    }

    // Getter method for height
    public int getHeight() {
        return height;
    }

    // Setter method for height
    public void setHeight(int height) {
        this.height = height;
    }

    // Method to calculate volume
    public int volume() {
        return getLength() * getWidth() * height;
    }

    // Method to calculate surface area
    public int surfaceArea() {
        return 2 * (getLength() * getWidth() + getWidth() * height + height * getLength());
    }
}

// Main Class
public class Prac_CH_10 {
    public static void main(String[] args) {
        // Creating Rectangle Object
        Rectangle rect = new Rectangle(4, 3);
        rect.setLength(5);  // Updating length
        rect.setWidth(4);   // Updating width

        System.out.println("Updated Rectangle Length: " + rect.getLength());
        System.out.println("Updated Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Area: " + rect.area());

        // Creating Cuboid Object
        Cuboid cuboid = new Cuboid(4, 3, 5);
        cuboid.setHeight(6);  // Updating height

        System.out.println("Updated Cuboid Height: " + cuboid.getHeight());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
        System.out.println("Cuboid Volume: " + cuboid.volume());
    }
}
