// Find first non-repeating element in a given Array of integers
// Given an array of integers of size N, the task is to find the first non-repeating element in this array. 

// Examples:

// Input: {-1, 2, -1, 3, 0}
// Output: 2
// Explanation: The first number that does not repeat is : 2

// Input: {9, 4, 9, 6, 7, 4}
// Output: 6

// import java.util.*;

// public class p1
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n =sc.nextInt();
//         System.out.print("Enter the values of array : ");
//         int arr[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
        
//         for(int i=0;i<n;i++)
//         { 
//             int count = 0;
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[j]==arr[i])                                                        // T.C. = O(n^2)  &&  S.C. = O(n)
//                 {
//                     count++;
//                 }
//             }
//             if(count==1)
//             {
//                 System.out.println("First non-repeating number : " + arr[i]);
//                 break;
//             }        
//         }
//     }
// }





// Print Non-repeating number in an array using HashMap
import java.util.*;

public class p1 {
    public static void main(String[] args) {                                          // T.C. = O(n)  &&  S.C. = O(n)
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();

        // System.out.print("Enter the values of arr : ");
        // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }

        String str=sc.nextLine();

        if(str.startsWith("{") && str.endsWith("}"))
        {
            str=str.substring(1,str.length()-1);
        }

        String s[]=str.split(",");

        int arr[]=new int[s.length];

        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }


        // Step 1: Count frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Find the first non-repeating
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                System.out.println("First non-repeating element: " + arr[i]);
                return;
            }
        }

        System.out.println("No non-repeating element found!");
    }
}