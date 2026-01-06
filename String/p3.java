// Program to print ASCII Value of a character.

// Examples :

// Input : a 
// Output : 97

// Input : D
// Output : 68

import java.util.*;

public class p3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
       // String str=sc.next();
        int str=sc.nextInt();

       // for(int i=0;i<str.length();i++)                                     // T.C = O(n)    S.C. = O(1)
       // {
            //int ch=str.charAt(i); 
            char ch=(char) str;
            System.out.println(ch);
       // }
        
    }
}