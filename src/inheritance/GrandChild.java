package inheritance;

public class GrandChild extends Child{

    String gender;
    public GrandChild(String s,int a,String g) {
        super(s, a);
        gender=g;
    }

    public void printGender() {
        System.out.println("Gender is: "+gender);
    }
}
