// Program to print all palindromes in a given range

// Given a range of numbers, print all palindromes in the given range. For example if the given range is {10, 115}, then output should
// be {11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111}
// We can run a loop from min to max and check every number for palindrome. If the number is a palindrome, we can simply print it. 


import java.util.*;

public class p22
{
    public static void main(String agrs[])                            
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value oF b : ");
        int b = sc.nextInt();

        for(int i=a;i<=b;i++)                                             // T.C. = O(n×k)   S.C. = O(1)
        {    
        int rev=0;                                                     
        int temp = i;

        while(temp!=0)
        {
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }

        if(i==rev)
        {
            System.out.print(rev+" ");
        }
        }
    }
}