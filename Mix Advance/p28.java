// The program will recieve 3 English words inputs from STDIN

// These three words will be read one at a time, in three separate line
// The first word should be changed like all vowels should be replaced by %
// The second word should be changed like all consonants should be replaced by #
// The third word should be changed like all char should be converted to upper case
// Then concatenate the three words and print them
// Other than these concatenated word, no other characters/string should or message should be written to STDOUT

// For example if you print how are you then output should be h%wa#eYOU.

// You can assume that input of each word will not exceed more than 5 chars 

import java.util.*;

public class p28                
{
    public static void main(String gg[])                                     
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a strings : ");
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3=sc.nextLine();

        for(int i=0;i<str1.length();i++)                                                      // T.C. = O(1)    S.C. = O(1)
        {
            char ch=str1.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                ch='%';
            }

            System.out.print(ch);
        }

        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                System.out.print(ch);
            }
            else
            {
                System.out.print("#");
            }   
        }

        System.out.print(str3.toUpperCase());
    }
}