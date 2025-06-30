package SDETJava;

public class LongestSubString {
    public static void main(String[] args)
    {
        String Example1 =  "aab";
        String Example2 = "pwwkew";
        String Example3 = "abcbcabcda";

        System.out.println(longestSubString(Example1,Example2,Example3));
    }

    public static String longestSubString(String str1,String str2,String str3)
    {
        String shortest = str1;
        if (str2.length()<shortest.length()) shortest = str2;
        if (str3.length()<shortest.length()) shortest = str3;

        for(int len=shortest.length();len>0;len--)
        {
            for(int i=0;i<=shortest.length()-len;i++)
            {
                String sub = shortest.substring(i,i+len);
                if(str1.contains(sub)&&str2.contains(sub)&&str3.contains(sub))
                    return sub;
            }
        }
        return "No Common Substring";
    }
}
