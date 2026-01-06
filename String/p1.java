// Program to count vowels, consonant, digits and special characters in string.

// Given a string and the task is to count vowels, consonant, digits and special character in string. 
// Special character also contains the white space.
// Examples: 

// Input : str = "geeks for geeks121"
// Output : Vowels: 5
//          Consonant: 8
//          Digit: 3
//          Special Character: 2

// Input : str = " A1 B@ d  adc"
// Output : Vowels: 2
//          Consonant: 4
//          Digit: 1
//          Special Character: 6

import java.util.*;

public class p1
{
    public static void main(String args[])                    // count "spaces" use " Character.isWhitespace(ch) "
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();
 
        str=str.toLowerCase();                                           // T.C = O(n)    S.C. = O(1)

        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    count1++;
                }
                else 
                {
                    count2++;
                }
            }
            else if(Character.isDigit(ch))
            {
                count3++;
            }
            else 
            {
                count4++;
            }
        }
        System.out.println("Vowels : "+count1);
        System.out.println("Consonant : "+count2);
        System.out.println("Dogit : "+count3);
        System.out.println("Special Character : "+count4);
    
    }
}