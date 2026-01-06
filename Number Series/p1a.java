
// Counting total primes

import java.util.*;

public class p1a
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n = sc.nextInt();

        int count = 0;

        for(int i=2;i<n;i++)                                                // T.C. = O(n × √n)   S.C. = O(1)
        {
            boolean prime=true;
            for(int j=2;j<=Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    prime=false;
                }
            }
            if(prime)
            {
                count++;
            }
        }
        System.out.print(count);
    }
}