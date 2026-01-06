// Question:

// To check whether a year is leap or not

// Step 1:

// We first divide the year by 4.
// If it is not divisible by 4 then it is not a leap year.
// If it is divisible by 4 leaving remainder 0 

// Step 2:

// We divide the year by 100
// If it is not divisible by 100 then it is a leap year.
// If it is divisible by 100 leaving remainder 0

// Step 3:

// We divide the year by 400
// If it is not divisible by 400 then it is a leap year.
// If it is divisible by 400 leaving remainder 0 

// Then it is a leap year 

import java.util.*;

public class p23
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        if((n%4==0 && n%100!=0) || n%400==0)                                            // T.C. = O(1)    S.C. = O(1)
        {
            System.out.println("Leap Year!");
        }
        else
        {
            System.out.println("Not Leap Year!");
        }
    }
}