interface topclass {
    void meth1();

    void meth2();
}

interface midclass extends topclass {
    void meth3();

    void meth4();
}

class newclass implements midclass{
    public void meth1(){
        System.out.println("Meth1");
    }
    public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
    public void meth5(){
        System.out.println("Meth4");
    }
}  

public class InheritanceInInterface {
    public static void main(String[] args) {

        newclass clsobj  = new newclass();
        clsobj.meth1();
        clsobj.meth3();
        clsobj.meth5();
    }
}