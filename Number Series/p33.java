// Largest and smallest digit of a number

// Given a number N. The task is to find the largest and the smallest digit of the number.
// Examples :

// Input : N = 2346 
// Output : 6 2 
// 6 is the largest digit and 2 is smallest

// Input : N = 5 
// Output : 5 5

import java.util.*;                                                      

public class p33
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        int min=n%10;
        int max=n%10;
        
        while(n>0)                                                      // T.C. = O(log n)   S.C. = O(1) 
        {
            int digit=n%10;
            n=n/10;
            if(max<digit)
            {
                max=digit;
            }
            if(min>digit)
            {
                min=digit;
            }
        }
        
        System.out.println(max+" "+min);
    }
}