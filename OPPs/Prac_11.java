// abstract class pen{

//     abstract void write();
//     abstract void refill();
// }

// class fountain_pen extends pen{

//     void write(){
//         System.out.println("I am writing");
//     }
//     void refill(){
//         System.out.println("I am refill");
//     }
//     void freemtd(){
//         System.out.println("I am free method");
//     }

// }

// public class Prac_11 {
//     public static void main(String[] args) {

//         fountain_pen fobj = new fountain_pen();
//         fobj.write();
//         fobj.refill();
//         fobj.freemtd();

//     }    
// }

// 2...

interface basicanimal {
    void eat();

    void sleep();
}

class monkey {
    public void jump() {
        System.out.println("I am jumping ");
    }

    public void bite() {
        System.out.println("Run Away otherwise i bite you");
    }
}

class human extends monkey implements basicanimal {
    public void speak() {
        System.out.println("I am speaking ");
    }

    public void eat() {
        System.out.println("I am eating ");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}

public class Prac_11 {
    public static void main(String[] args) {

        human humanobj = new human();
        humanobj.speak();
        humanobj.sleep();
        humanobj.bite();

        // Q.5---
        monkey monkeyobj = new human();
        monkeyobj.bite();
        monkeyobj.jump();
        basicanimal aniobj = new human();
        // aniobj.speak(); //not working...
        aniobj.eat();
        aniobj.sleep();

    }
}
