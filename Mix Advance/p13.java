// Find If every number appears twice except one, then XOR of the whole array will directly give you that unique number.

import java.util.*;

public class p13
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of arr : ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)                                                             // T.C. = O(n)    S.C. = O(1)
        {
            arr[i]=sc.nextInt();
        }

        int result=0;

        for(int i=0;i<n;i++)
        {
            result=result^arr[i];
        }

        System.out.println(result);
    }
}