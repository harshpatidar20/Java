
// Find common Height Difference or Detect Invalid Input 

// Given the height of a tree for 4 consecutive weeks, calculate the difference b/w each week.

// If any height is negative , return "Not Valid inputs".
// If any two weekly differences are the same , return the difference.
// If all differences are different, return "None".

// Approach

// Step 1 : Check if any height is negative.If so,return "Not valid inputs".
// Step 2 : Calculate the differences:

// diff1 = height2 - height1
// diff2 = height3 - height2
// diff3 = height4 - height3

// Step 3 : If any two of the above differences are the same , return the common difference.
// Step 4 : If all differences are different , return "None".

// Input : Four Integers representing the height of the tree in 4 consective weeks.

// Examples : 

// Input : 2,4,6,7
// Output : 2 

//Explanation : Difference are 2,2 and 1-> 2 appears twice.

// Input : 5,10,11,13
// Output : None

// Input : -1,3,4,5
// Output : Not valid inputs

import java.util.*;

public class p15                                           
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of arr : ");
        int arr[] = new int[4];

        for(int i=0;i<4;i++)                                                    
        {
            arr[i]=sc.nextInt();
        }

        if(arr[0]<0 || arr[1]<0 || arr[2]<0 || arr[3]<0)                                   // T.C. = O(1)   S.C. = O(1)
        {
            System.out.println("Not valid inputs");
            return;
        }

        int diff1=arr[1]-arr[0];
        int diff2=arr[2]-arr[1];
        int diff3=arr[3]-arr[2];
        
        if(diff1==diff2)
        {
            System.out.println(diff1);
        }
        else if(diff2==diff3)
        {
            System.out.println(diff2);
        }
        else if(diff1==diff3)
        {
            System.out.println(diff3);
        }
        else
        {
            System.out.println("None");
        }
    }
}