package SDETJava;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Marvel";
        String str3 = "Thanos";
        System.out.println(revStr(str2));
    }

    public static String revStr(String str)
    {
        StringBuilder res = new StringBuilder();

        for (int i=str.length()-1;i>=0;i--)
        {
            res.append(str.charAt(i));
        }

        return res.toString();
    }
}
