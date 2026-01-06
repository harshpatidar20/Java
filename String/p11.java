// Find Character Frequencies in Order of Occurrence

// Given string s containing only lowercase characters, the task is to print the characters along with their frequency
// in the order of their occurrence and in the given format explained in the examples below.

// Examples: 

// Input: s = "geeksforgeeks"
// Output: g2 e4 k2 s2 f1 o1 r1

// Input: str = "elephant"
// Output: e2 l1 p1 h1 a1 n1 t1

import java.util.*;

public class p11                                                   
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        int freq[] = new int[26];                                                // T.C = O(n)    S.C. = O(n)                                    

        for(int i=0;i<str.length();i++)                                  
        {
            freq[str.charAt(i)-'a']++;   
        }

        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            if(freq[idx]>0)
            {
                System.out.print(str.charAt(i)+""+freq[idx]+" ");
                freq[idx]=0;
            }
        }
    }
}