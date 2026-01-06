// Addition of two numbers a Twist
// Using a method, pass two variables and find the sum of two numbers.
// Test case:
// Number 1 – 20
// Number 2 – 20.38
// Sum = 40.38

// There were a total of 4 test cases. Once you compile 3 of them will be shown to you and 1 will be a hidden one. 
// You have to display error message if numbers are not numeric.

import java.util.*;

public class p29
{
    public static double add(double a ,double b)                                         // T.C. = O(1)    S.C. = O(1)                       
    {
        double c=a+b;
        return c;
    }

    public static void main(String gg[])
    {
        try {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();

        System.out.println(add(a,b));
        }

        catch(InputMismatchException e)
        {
            System.out.println("Invalid Input");
        }
        
    }
}