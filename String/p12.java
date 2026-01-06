// First non-repeating character of given string

// Given a string s of lowercase English letters, the task is to find the first non-repeating character.
// If there is no such character, return '$'.

// Examples: 

// Input: s = "geeksforgeeks"
// Output: 'f'
// Explanation: 'f' is the first character in the string which does not repeat.

// Input: s = "racecar"
// Output: 'e'
// Explanation: 'e' is the only character in the string which does not repeat.

// Input: "aabbccc"
// Output: '$'
// Explanation: All the characters in the given string are repeating.

// import java.util.*;

// public class p12
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String : ");                  
//         String str=sc.nextLine();

//         boolean found=false;
//         for(int i=0;i<str.length();i++)                                 // T.C = O(n^2)    S.C. = O(1)
//         {
//             int count=0;
//             for(int j=0;j<str.length();j++)
//             {
//                 if(str.charAt(i)==str.charAt(j))
//                 {
//                     count++;
//                 }
//             }
//             if(count==1)
//             {
//                 System.out.println(str.charAt(i));
//                 found=true;
//                 break;
//             }
//         }
//         if(!found)
//         {
//             System.out.println('$');
//         }
       
//     }
// }




import java.util.*;

public class p12 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();

        int[] freq = new int[26]; // For 'a' to 'z'

        // First pass: Count frequency of each character
        for(int i=0;i<str.length();i++)                                                 // T.C = O(n)    S.C. = O(1)
        {                                     
            freq[str.charAt(i)-'a']++;
        }

        // Second pass: Find the first non-repeating character
        boolean found=false;
        for(int i=0;i<str.length();i++) 
        {
            if(freq[str.charAt(i)-'a'] == 1) 
            {
                System.out.println(str.charAt(i));
                found=true;
                break;
            }
        }

        if(!found) 
        {
            System.out.println('$');
        }
    }
}
