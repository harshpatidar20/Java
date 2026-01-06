
// Write a progarm in to check whether two given strings are anagrams of each other or not.

// Two strings are said to be anagrams if they conatain the same characters int the same frequency, but possibly in a different order.

// Input :

// Two strings, str1 and str2.

// Output :

// Print "Anagrams" if the two strings are anagrams.
// Print "Not Anagrams" otherwise.

// Example :

// Input : str1 = "listen"
//         str2 = "silent"

// Output : Anagrams

import java.util.*;                                      

public class p22                                         
{
   public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a str1 : ");
        String str1=sc.next();
        System.out.print("Enter a str2 : ");
        String str2=sc.next();

        if(str1.length()!=str2.length())                                                  //  T.C. = O(n)    S.C. = O(1)
        {
            System.out.println("Not Anagrams");
            return;
        }

        int count[]=new int[256];

        for(int i=0;i<str1.length();i++)
        {
            count[str1.charAt(i)]++;
        }

        for(int i=0;i<str2.length();i++)
        {
            count[str2.charAt(i)]--;
        }

        for(int i=0;i<256;i++)
        {
            if(count[i]!=0)
            {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}