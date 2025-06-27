public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void checkIfAdult(){
        if (age < 18)
            try{
            throw new Exception();
        }catch (Exception e){System.out.print("Not an adult");
        }else {
            System.out.println("Person is an adult.");
        }
    }

    public static void main(String[] args){
        Person person = new Person(17); // Example age
        person.checkIfAdult();
    }
}
