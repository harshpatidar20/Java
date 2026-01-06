// Remove characters from the first string which are present in the second string

// Given two strings string1 and string2, remove those characters from the first string(string1) which are present
// in the second string(string2). Both strings are different and contain only lowercase characters.
// NOTE: The size of the first string is always greater than the size of the second string( |string1| > |string2|).

// Example:

// Input:
// string1 = "computer"
// string2 = "cat"
// Output: "ompuer"
// Explanation: After removing characters(c, a, t)
// from string1 we get "ompuer".

// Input:
// string1 = "occurrence"
// string2 = "car"
// Output: "ouene"
// Explanation: After removing characters
// (c, a, r) from string1 we get "ouene".


import java.util.*;                                         
public class p6
{                                                                
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Str1 : ");
        String str1=sc.nextLine();
        System.out.print("Enter the Str2 : ");
        String str2=sc.nextLine();

        HashSet<Character> set = new HashSet<>();                                  //T.C = O(n+m)  S.C = O(m)

        for(int i=0;i<str2.length();i++)   //O(m)
        {
            set.add(str2.charAt(i));      //O(m) ->S.C.
        }

        for(int i=0;i<str1.length();i++)  //O(n)
        {
            if(!set.contains(str1.charAt(i)))
            {
                System.out.print(str1.charAt(i));
            }
        }
    }
}
