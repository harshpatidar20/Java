// Bubble Sort Algorithm

import java.util.*;

public class p1
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

        for(int i=0;i<n-1;i++)                                           // T.C. = O(n^2) && S.C. = O(1) but in Best Case : O(n)
        {
            boolean flag=false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag==false)
            {
                break;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}