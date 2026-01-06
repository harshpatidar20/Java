// Program to check Strong Number

// Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number. Given a number, check if it is a Strong Number or not.
// Examples: 

// Input  : n = 145
// Output : Yes
// Sum of digit factorials = 1! + 4! + 5!
//                         = 1 + 24 + 120
//                         = 145
// Input :  n = 534
// Output : No

import java.util.*;

public class p11
{
    public static void main(String agrs[])                                                     
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();                         

        int sum=0;                                             // T.C. = O(log n)   S.C. = O(1)
        int x=n;

        while(n!=0)
        {
            int digit=n%10;
            n=n/10;

            int result=1;
            
            for(int i=1;i<=digit;i++)
            {
                result*=i;
            }

            sum+=result;
        }

        if(x==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       
    }
}