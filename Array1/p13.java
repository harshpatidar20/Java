// Check if an Array is Sorted.

// Given an array of size n, the task is to check if it is sorted in ascending order or not. Equal values are allowed in an array and
// two consecutive equal values are considered sorted.

// Examples: 

// Input: arr[] = [20, 21, 45, 89, 89, 90]
// Output: Yes

// Input: arr[] = [20, 20, 45, 89, 89, 90]
// Output: Yes

// Input: arr[] = [20, 20, 78, 98, 99, 97]
// Output: No


import java.util.*;

public class p13
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
            arr[i]=sc.nextInt();                                                             // T.C. = O(n)  &&  S.C. = O(n)
        }

        boolean isSorted = true;

        for(int i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1])
            {
                isSorted=false;
                break;
            }
        }

        if(isSorted)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}