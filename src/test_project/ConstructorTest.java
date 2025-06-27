package test_project;

public class ConstructorTest {
    int a,b;
    ConstructorTest(int a,int b) {
        this.a=a; this.b=b;
    }

    public static void main(String[] args) {
        ConstructorTest obj = new ConstructorTest(2,3);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
