// Find the 15th term of the series?
// 0,0,7,6,14,12,21,18,28

// Explanation :

// In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }
// And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }

import java.util.*;

public class p25
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        if(n%2==0)                                                               // T.C. = O(1)    S.C. = O(1)
        {
            int e=((n-1)/2)*6;
            System.out.print(e);
        }
        else
        {
            int e=((n-1)/2)*7;
            System.out.print(e);
        }
    }
}