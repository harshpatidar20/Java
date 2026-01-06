// Program to remove vowels from a String.

// Given a string, remove the vowels from the string and print the string without vowels. 

// Examples: 

// Input : welcome to geeksforgeeks
// Output : wlcm t gksfrgks

// Input : what is your name ?
// Output : wht s yr nm ?

import java.util.*;

public class p4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        str=str.toLowerCase();

        for(int i=0;i<str.length();)                                                   // T.C = O(n)    S.C. = O(1)
        {
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                i++;
            }
            else 
            {
                System.out.print(ch);
                i++;
            }

        }
    }
}