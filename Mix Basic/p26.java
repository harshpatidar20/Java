
// Write a Program that reads a string input from the user and removes all consecutive duplicate characters while maintaining the
// original order of distinct characters. The program should then output the modified string.

// Example :

// Input : 223334566667777

// Output : 234567

import java.util.*;

public class p26                                        
{
   public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a str : ");
        String str=sc.next();

        StringBuilder result= new StringBuilder();                                           //  T.C. = O(n)    S.C. = O(n)

        result.append(str.charAt(0));

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i)!=str.charAt(i-1))
            {
                result.append(str.charAt(i));
            }
        }

        System.out.print(result.toString()); 
    }
}