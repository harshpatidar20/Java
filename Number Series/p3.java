// Program for sum of geometric series

// A Geometric series is a series with a constant ratio between successive terms. The first term of the series is denoted by a and 
// common ratio is denoted by r. The series looks like this :- a, ar, ar2, ar3, ar4, . . .. The task is to find the sum of such a series. 

// Examples :

// Input : a = 1
//         r = 0.5
//         n = 3
// Output : 1.75
// We get sum as 1 + 1 * 0.5 + 1 * 0.5 * 0.5 = 1 + 0.5 + 0.25 = 1.75

// Input : a = 2
//         r = 2
//         n = 15
// Output : 65534

import java.util.*;

public class p3
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value oF r : ");
        double r = sc.nextDouble();
        System.out.print("Enter the value oF n : ");
        int n = sc.nextInt();

        double sum=0;                                               // T.C. = O(log n)   S.C. = O(1)
        if(r==1)
        {
            sum+=a*n;
        }
        else
        {
            sum+=a*(1-Math.pow(r,n))/(1-r);
        }
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