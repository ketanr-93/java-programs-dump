package inheritance;

public class Vehicle {

    int cost;
    int speed;

    public Vehicle(int c,int s){
        cost = c;
        speed = s;
    }

    public void showVehicleDetails(){
        System.out.println("Vehicle Details");
        System.out.println("Cost: "+cost);
        System.out.println("Speed: "+speed);
    }
}
