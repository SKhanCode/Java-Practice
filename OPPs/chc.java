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
public class chc {
    public static void main(String[] args) {
        // Creating Rectangle Object
        Rectangle rect = new Rectangle(4, 3);
        System.out.println("Rectangle Area: " + rect.area());

        // Creating Cuboid Object
        Cuboid cuboid = new Cuboid(4, 3, 5);
        System.out.println("Cuboid Volume: " + cuboid.volume());
        System.out.println("Cuboid Surface Area: " + cuboid.surfaceArea());
    }
}

