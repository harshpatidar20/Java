// Count words in a given string

// Given a string, count the number of words in it. The words are separated by the following characters:
// space (' ') or new line ('\n') or tab ('\t') or a combination of these.

// Input: str = "abc\\p\""
// output: 1

import java.util.*;                                                        

public class p17                                                             
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");                   
        String str=sc.nextLine();

        int count=0;
        boolean word = false;

        for(int i=0;i<str.length();i++)                                          // T.C = O(n)    S.C. = O(1)
        {
            char ch=str.charAt(i);
            if(ch!= ' ' && ch!='\n' && ch!='\t')
            {
                if(word==false)
                {
                count++;
                word = true;
                }
            }
            else
            {
                word=false;
            }
        }
        System.out.print("Words : "+count);
  
    }
}