// Remove brackets from an algebraic string containing + and - operators

// Given an algebraic expression as a string s containing operands (letters), + and - operators, and parentheses, simplify the expression 
// by removing all parentheses and correctly applying the operators. Return the simplified expression without parentheses.

// Examples: 

// Input:"(a - (b + c) + d)"
// Output: "a- b - c + d"
// Explanation: a - (b + c) + d simplifies to a - b - c + d

// Input:"a - (b - c - (d + e )) - f"
// Output: "a - b + c + d + e - f" 
// Explanation: c - (d + e), to get (c - d - e) The outer - flips the signs, resulting in a - b + c + d + e - f


import java.util.*;                   

public class p22                                            
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");          // NOT COMPLETED
        String str = sc.nextLine();

        for(int i=0;i<str.length();)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch==')' || ch=='[' || ch==']' || ch=='{' || ch=='}')
            {
                i++;
            }
            else
            {
                System.out.print(str.charAt(i));
                i++;
            }
        }
    }
}