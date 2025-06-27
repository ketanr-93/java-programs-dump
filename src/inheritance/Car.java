package inheritance;

public class Car extends Vehicle{

    String color;
    int tyres;
    public Car(int c,int s, String co, int ty){
        super(c,s);
        color = co;
        tyres = ty;
    }

    public void showCarDetails(){
        System.out.println("Car Details");
        System.out.println("Color: "+color);
        System.out.println("Tyres: "+tyres);
    }
}
