package Abstraction;

abstract class Parent{
    public Parent(){
        System.out.println("Constructor of base");
    }

    public void sayHello()
    {
        System.out.println("Hello from parent");
    }

    abstract public void greet();
}

class Child extends Parent
        {
            @Override
            public void greet()
            {
                System.out.println("Hello from child");
            }

        }

abstract class Child2 extends Parent
{
  abstract public void show();
}

public class AbtrasctionTest {
    public static void main(String[] args)
    {
        Child p = new Child();
        p.sayHello();
    }


}
