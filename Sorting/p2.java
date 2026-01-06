// Selection Sort

import java.util.*;

public class p2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        System.out.print("Enter the values : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)                                                 // T.C. = O(n^2) && S.C. = O(1)
        {
            int smallest = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[smallest] > arr[j])
                {
                   smallest=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}