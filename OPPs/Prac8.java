
 class employee {

     int salary;
     int getsalary;
     String name;
     String getname;
     String setname;

     public void printdetails(){
        System.out.println("Employee salary is "+ salary);
        System.out.println("Employee getsalary is "+ getsalary);
        System.out.println("Employee name is "+ name);
        System.out.println("Employee getname is "+ getname);
        System.out.println("Employee setname is "+ setname);
     }
     
    
}

class square {
    float side;
    
    public float area(){
        return side*side;

    }
    public float parimeter(){
        return 4*side;
    }
    
    
}
class rectangle {
    float length;
    float width;
    
    public float area(){
        return length*width;

    }
    public float parimeter(){
        return 2*(length+width);
    }
    
    
}


public class Prac8 {
public static void main(String[] args) {
    employee sohel = new employee(); 
    sohel.salary = 25;
    sohel.getsalary = 1000;
    sohel.name = "Sohel_Haider_Khan";
    sohel.getname = "Sohel_Khan";
    sohel.setname = "SKHAN";

    sohel.printdetails();


    //Ans 2:------
    square sq = new square();
    sq.side = 3;
    System.out.println(sq.area());
    System.out.println(sq.parimeter());


    //ans 3:-----
    rectangle rec = new rectangle();
    rec.length = 3;
    rec.width = 4;
    System.out.println("Area is "+rec.area());
    System.out.println("Parimeter is "+rec.parimeter());

}
    
}
