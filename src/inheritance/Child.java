package inheritance;

public class Child extends Parent{

    int age=0;
    public Child(String s,int a){
        super(s);
        age=a;
    }

    public void printAge(){
        System.out.println("Age is "+age);
    }
}
