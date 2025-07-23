class myemployee {
    private int id;
    private String nami;

    public String getname() {
        return nami;
    }

    public void setname(String name) {
        nami = name;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        myemployee Sohel = new myemployee();
        Sohel.setname("Paaji");
        System.out.println(Sohel.getname());
    }
}
