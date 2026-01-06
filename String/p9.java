// Calculate sum of all numbers present in a string

// Given a string S containing alphanumeric characters, The task is to calculate the sum of all numbers present in the string.

// Examples: 

// Input:  1abc23
// Output: 24
// Explanation: 1 + 23 = 24

// Input:  geeks4geeks
// Output: 4

// Input:  1abc2x30yz67
// Output: 100

import java.util.*;                                           //           Stop Here    

public class p9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
                                    
        int sum=0;
        StringBuilder temp=new StringBuilder();                                        // T.C = O(n)    S.C. = O(1)

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))                    
            {
                temp.append(ch);
            }
            else 
            {
                if(temp.length()>0)
                {
                    sum+=Integer.parseInt(temp.toString());
                    temp.setLength(0);
                }
            }
        }
        if(temp.length()>0) 
        {
            sum += Integer.parseInt(temp.toString());
        }
        System.out.println("Sum : "+sum);  
    }
}