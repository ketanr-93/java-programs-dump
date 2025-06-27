package inheritance;

public class Boss {

   public static void main(String[] args) {
//       Car car = new Car(200,60, "Red", 4);
//       car.showVehicleDetails();

       GrandChild gc = new GrandChild("John", 25,"Female");
       gc.printName();
       gc.printAge();
       gc.printGender();
   }
}
