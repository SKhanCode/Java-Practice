
class myemployee {
    private int id;
    private String name;

    public myemployee(){
        id=45;
        name="SoheliCon";
    }
    public myemployee(String namo, int frog){
        id=frog;
        name= namo;
    }
    public myemployee(String namo){
        
        name= namo;
    }

    public int getid() { return id;  }
    public void setid(int n) { id = n;}

    public String getname() {return name; }
    public void setname(String n) {name = n;    }

    public void printdetails() {
        System.out.println("sohlii");
        System.out.println("kxjn");
    }

    public void displayDetails() {
        System.out.println("sohrl");
        System.out.println("kxjn");
    }
}

public class constructor {

    public static void main(String[] args) {
        // myemployee sohel = new myemployee("sohijjjjj",65);
        // myemployee sohel = new myemployee();
        myemployee sohel = new myemployee("Method_Overloading");

        // sohel.id = 90;
        // sohel.name = "Sohel_Khan";
        // sohel.setid(90);
        // sohel.setname("Sohelii");
        System.out.println(sohel.getid());
        System.out.println(sohel.getname());
        // System.out.println("Id " + sohel.id);
        // System.out.println("Name " + sohel.name);

        // sohel.printdetails();
        // sohel.displayDetails();

    }
}
