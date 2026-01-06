// Program for average of an array (Iterative and Recursive)

// Given an array, the task is to find average of that array. Average is the sum of array elements divided by the number of elements.

// Examples : 

// Input : arr[] = {1, 2, 3, 4, 5}
// Output : 3
// Sum of the elements is 1+2+3+4+5 = 15 
// and total number of elements is 5.
// So average is 15/5 = 3

// Input : arr[] = {5, 3, 6, 7, 5, 3}
// Output : 4.83333
// Sum of the elements is 5+3+6+7+5+3 = 29
// and total number of elements is 6.
// So average is 29/6 = 4.83333.

// Iterative

import java.util.*;

public class p23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();                                                             
        }

        int sum=0;                                                             // T.C. = O(n)  &&  S.C. = O(1)
       
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        float avg=(float)sum/n;

        System.out.printf("%.5f",avg);
    }
}


// Recursive


// import java.util.*;

// public class p23
// {
//     public static double avg(int arr[], int n)                           // T.C. = O(n)  &&  S.C. = O(n)
//     {
//         if(n==1)
//         {
//             return arr[0];
//         }

//         return (arr[n-1] + (n-1) * avg(arr, n-1)) / (double)n;

//     }
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n=sc.nextInt();
//         System.out.print("Enter the values of array : ");
//         int arr[] = new int[n];
        
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();                                                             
//         }

//         System.out.println(avg(arr,n));
//     }
// }