// Program for sum of arithmetic series

// A series with the same common difference is known as arithmetic series. The first term of series is a and the common difference is d. 
// The series looks like a, a + d, a + 2d, a + 3d, . . . Task is to find the sum of the series. 

// Examples: 

// Input : a = 1
//         d = 2
//         n = 4
// Output : 16
// 1 + 3 + 5 + 7 = 16

// Input : a = 2.5
//         d = 1.5
//         n = 20
// Output : 335

import java.util.*;

public class p2
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value oF d : ");
        double d = sc.nextDouble();
        System.out.print("Enter the value oF n : ");
        int n = sc.nextInt();

        double sum=(n * (2 * a + (n-1)*d ))/2;                                // T.C. = O(1)   S.C. = O(1)

        if(Math.abs(sum - Math.round(sum)) < 1e-9) 
        {
            System.out.println((int)sum); // print as int if whole number
        } 
        else 
        {
            System.out.println(sum); // print as decimal
        }
    }
}