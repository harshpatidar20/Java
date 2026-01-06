// Sort string of characters

// Given a string of lowercase characters from 'a' - 'z'. We need to write a program to print the characters of this string in sorted order.

// Examples: 

// Input : "dcab" 
// Output : "abcd"

// Input : "geeksforgeeks"
// Output : "eeeefggkkorss"

import java.util.*;                                                  

public class p15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        char arr[]= str.toCharArray();                                                 // T.C = O(nlog n)    S.C. = O(n)

        Arrays.sort(arr);

        System.out.print(arr);

    }
}