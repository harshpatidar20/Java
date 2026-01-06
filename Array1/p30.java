// Maximum Product Subarray

// Given an array arr[] consisting of positive, negative, and zero values, find the maximum product that can be obtained from any contiguous subarray of arr[].

// Examples:

// Input: arr[] = [-2, 6, -3, -10, 0, 2]
// Output: 180
// Explanation: The subarray with maximum product is [6, -3, -10] with product = 6 * (-3) * (-10) = 180.

// Input: arr[] = [-1, -3, -10, 0, 6]
// Output: 30
// Explanation: The subarray with maximum product is [-3, -10] with product = (-3) * (-10) = 30.

// Input: arr[] = [2, 3, 4] 
// Output: 24 
// Explanation: For an array with all positive elements, the result is product of all elements. 

import java.util.*;                    

public class p30                                            
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

        int maxProduct = arr[0];                                                     // T.C. = O(n)  &&  S.C. = O(1)
        int minProduct = arr[0];
        int result = arr[0];

        for(int i=1;i<n;i++)
        {
            int tempMax = Math.max(arr[i], Math.max(arr[i]*maxProduct, arr[i]*minProduct));
            int tempMin = Math.min(arr[i], Math.min(arr[i]*maxProduct, arr[i]*minProduct));

            maxProduct= tempMax;
            minProduct= tempMin;
            result= Math.max(result,maxProduct);
        }

        System.out.println(result);
      
    }
}