package SDETJava;

public class ArrayReversal {

    public static void main(String[] args)
    {
        int[] inputArr = {1,2,3,4,5};
        revArray(inputArr);
        printArray(inputArr);
    }
    public static void revArray(int[] inputArr)
    {
        int start=0;
        int end=inputArr.length -1;

        while(start<end)
        {
            int temp = inputArr[start];
            inputArr[start] = inputArr[end];
            inputArr[end]=temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
