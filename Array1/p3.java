// Array Reverse -

// Given an array arr[], the task is to reverse the array. Reversing an array means rearranging the elements such that
// the first element becomes the last, the second element becomes second last and so on.

// Examples:

// Input: arr[] = {1, 4, 3, 2, 6, 5}  
// Output: {5, 6, 2, 3, 4, 1}
// Explanation: The first element 1 moves to last position, the second element 4 moves to second-last and so on.

// Input: arr[] = {4, 5, 1, 2} 
// Output: {2, 1, 5, 4}
// Explanation: The first element 4 moves to last position, the second element 5 moves to second last and so on.

// import java.util.*;

// public class p3
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n =sc.nextInt();
//         System.out.print("Enter the values of array : ");
//         int arr[] = new int[n];

//         for(int i=0;i<n;i++)                                                       // T.C. = O(n)  &&  S.C. = O(n)
//         {
//             arr[i]=sc.nextInt();
//         }

//         for(int i=n-1;i>=0;i--)
//         {
//             System.out.print(arr[i]+" ");
//         }
//     }
// }



import java.util.*;

public class p3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[]=new int[n];

        for(int i=0;i<n;i++)                                                // T.C. = O(n)  &&  S.C. = O(1)
        {              
            arr[i]=sc.nextInt();
        }

        // Reverse the array in-place
        int start=0;
        int end=n-1;

        while(start<end) 
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        // Print reversed array
        for(int i=0;i<n;i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }
}
