
// Finding Permutation of a number 

import java.util.*;                                             

public class p17
{
    public static int fact(int n)                                       //  T.C. = O((n)    S.C. = O(1)
    {
        int f=1;

        for(int i=1;i<=n;i++)
        {
            f*=i;
        }

        return f;
    }

    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value : ");
        int n=sc.nextInt();

        System.out.println(fact(n));
    }
}