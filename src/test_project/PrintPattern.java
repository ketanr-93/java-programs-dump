package test_project;

public class PrintPattern {
    public static void main(String args[]) {
        int n = 7;
        for (int i=n;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=n-i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}