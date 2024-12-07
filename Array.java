import java.util.*;
public class Array
{
    public static void main(String[] args)
    {
        int arr[]={23,56,78,90,67};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        arr[2]=234;
        arr[3]=567;
        System.out.println(Arrays.toString(arr));
    }
}