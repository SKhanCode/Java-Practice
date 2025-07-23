class phone {
    public void name() {
        System.out.println("I am Phone ");
    }

    public void music() {
        System.out.println("Not capable for music playing");
    }

    public void color() {
        System.out.println("Black & White");
    }
}

class smartphone extends phone {
    public void name() {
        System.out.println("I am SmartPhone ");
    }

    public void music() {
        System.out.println("Capable for music playing");
    }

    public void Video() {
        System.out.println("Capable for Video playing");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        // smartphone pobj = new phone(); // Not allowed
        phone sobj = new smartphone();  //when write new obj() means Object always create on Run Time...
        sobj.name();
        sobj.music();
        sobj.color();
        // sobj.video(); --- Not allowed.

    }
}
