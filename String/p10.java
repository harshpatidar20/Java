// Capitalize the first and last character of each word in a string

// Given the string, the task is to capitalize the first and last character of each word in a string.
// Examples: 
 
// Input: Geeks for geeks
// Output: GeekS FoR GeekS

// Input: Geeksforgeeks is best
// Output: GeeksforgeekS IS BesT

import java.util.*;                                         

public class p10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");                   
        String str=sc.nextLine();

        String words[] = str.split(" ");
       
        StringBuilder result = new StringBuilder();                                         // T.C = O(n)    S.C. = O(n)

        for(int i=0;i<words.length;i++)
        {
            StringBuilder sb = new StringBuilder(words[i]);

            sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));

            sb.setCharAt(sb.length()-1,Character.toUpperCase(sb.charAt(sb.length()-1)));

            result.append(sb);

            if(i < words.length - 1)
            {
                result.append(" ");
            }
        }

        System.out.print(result.toString());

    }
}