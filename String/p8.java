// Reverse a String in Java

// In Java, reversing a string means reordering the string characters from the last to the first position. Reversing a string is a
// common task in many Java applications and can be achieved using different approaches. In this article,
// we will discuss multiple approaches to reverse a string in Java with examples, their advantages, and when to use them.

import java.util.*;

public class p8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.next();

        StringBuilder reverse = new StringBuilder();                                   // T.C = O(n)    S.C. = O(n)

        for(int i=str.length()-1;i>=0;i--)
        {
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse.toString());
    }
}