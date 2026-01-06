// Find maximum occurring character in a string

// Given string str. The task is to find the maximum occurring character in the string str.

// Examples:

// Input: geeksforgeeks
// Output: e
// Explanation: 'e' occurs 4 times in the string

// Input: test
// Output: t
// Explanation: 't' occurs 2 times in the string

import java.util.*;

public class p18                                          
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");                   
        String str=sc.nextLine();
        
        LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();

        for(int i=0;i<str.length();i++)                                                  // T.C = O(n)    S.C. = O(n)
        {
            char ch=str.charAt(i);
            if(!hm.containsKey(ch))
            {
                hm.put(ch,1);
            }
            else
            {
                int current=hm.get(ch);
                hm.put(ch,current+1);
            }
        }

        int maxCount = 0;
        char maxChar = ' ';

        for(char key : hm.keySet()) 
        {
            int count = hm.get(key);
            if(count > maxCount)
            {
                maxCount = count;
                maxChar = key;
            }
        }

        System.out.print(maxChar);
           
    }
}