// Number is Palindrome 

//Input : n=12
//Output: NO

//Input : n=121
//Output : YES

import java.util.*;

public class p21
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int rev=0;                                                      // T.C. = O(log n)   S.C. = O(1)
        int original = n;

        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }

        if(original==rev)
        {
        System.out.println("YES");
        }
        else
        {
        System.out.println("NO");
        }
    }
}