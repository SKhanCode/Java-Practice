interface camera {
    // void snap();

    void takesnap();

    void recordvideo();

    // void record4kvideo();// Not allowed because this method is not implement in
    // MySmartPhone class;
    default void record4kvideo() { // its allowe because its default me
        System.out.println("Hello paagi ");
    }

}

interface wifi {
    String[] getnetwork();

    void connectnetwork(String network);
}

class mycellphone {
    void callnumber(int phonenumber) {
        System.out.println("Calling " + phonenumber);
    }

    void pickcall() {
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends mycellphone implements wifi, camera {
    public void takesnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Recording video");

    }

    public String[] getnetwork() {
        System.out.println("Getting list of network");
        String[] networklist = { "Sohel", "Ahesan", "Sumit" };
        return networklist;
    }

    public void connectnetwork(String network) {
        System.out.println("Connecting to " + network);

    }
    // public void record4kvideo(){ //its default method so when we overwrite method
    // in MySmartPhone class and when main method call it then always call
    // MySmartphone method not interface(camera) method;
    // System.out.println("taking snappi");
    // }
}

public class PolymorphisimWthInterfce {
    public static void main(String[] args) {

     camera cam1  = new MySmartPhone();
     cam1.record4kvideo();
     cam1.takesnap();
        
    }
    
}