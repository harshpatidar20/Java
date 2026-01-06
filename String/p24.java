// Reverse words in a string

// Given a string s, find a way to reverse the order of the words in the given string.

// Note: string may contain leading or trailing dots(.) or multiple trailing dots(.) between two words. 
// The returned string should only have a single dot(.) separating the words.

// Examples:

// Input: s = "i.like.this.program.very.much" 
// Output: much.very.program.this.like.i
// Explanation: The words in the input string are reversed while maintaining the dots as separators, resulting in "much.very.program.this.like.i".

// Input: s = ”..geeks..for.geeks.” 
// Output: geeks.for.geeks

// Input: s = "...home......"
// Output: home


import java.util.*;                                    

public class p24
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");          
        String str = sc.nextLine();

        StringBuilder reverse = new StringBuilder();                                   // T.C = O(n)    S.C. = O(n)

        str = str.replaceAll("^\\.+|\\.+$", "");

        String words[] = str.split("\\.+");

        for(int i=words.length-1;i>=0;i--) 
        {
            reverse.append(words[i]);
            if(i!=0) 
            {
                reverse.append(".");
            }
        }

        System.out.println(reverse.toString());
        
    }
}