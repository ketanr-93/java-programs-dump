interface StringExample{
    String reverse(String s);
}

public class lambdaTest {
    static int b=10;
    public static void main(String[] args) {
        StringExample se = (s) -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
                b++;
            }
            return result;
        };
        System.out.println(se.reverse("Hello World"));
        System.out.println(b);

    }
}
