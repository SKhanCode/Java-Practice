class a {
    public void meth1() {
        System.out.println("I m method1 of class A");
    }

    public void meth2() {
        System.out.println("I m method2 of class A");
    }
}
class b extends a {
    public void meth2() {
        System.out.println("I m method1 of class B");
    }
    public void meth4() {
        System.out.println("I m method2 of class B");
    }

}

public class Method_Overriding {
    public static void main(String[] args) {
    
        a ob = new a();
        ob.meth1();
        ob.meth2();
        b obb = new b();
        obb.meth2();
        obb.meth4();
        

    }
}
