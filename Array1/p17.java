//Given a arr[] and print a new arr[] with distinct elements means remove duplicates.

// Input: arr[] = [2, 1, 2, 6, 2]
// Output: [2,1,6]

// Input: arr[] = [1, 2, 11, 2, 6, 4, 4, 5, 8]
// Output: [1, 2, 4, 5, 6, 8, 11]

// Input: arr[] = [1, 2, 3]
// Output: [1, 2, 3]
// Explanation : No change as all elements are distinct.

import java.util.*;                                    

public class p17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Set<Integer> s=new HashSet<>();

        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)                                                           // T.C. = O(n)  &&  S.C. = O(n)
        {
            s.add(sc.nextInt());                                                             
        }

        System.out.print(s);                                                             

    }
}