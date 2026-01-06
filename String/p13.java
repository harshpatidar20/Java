// Program to find Smallest and Largest Word in a String

// Given a string, find the minimum and the maximum length words in it. 

// Examples: 
// Input : "This is a test string"
// Output : Minimum length word: a
//          Maximum length word: string
// Input : "GeeksforGeeks A computer Science portal for Geeks"
// Output : Minimum length word: A
//          Maximum length word: GeeksforGeeks


import java.util.*;                               

public class p13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        String words[] = str.split(" ");                                             // T.C = O(n)    S.C. = O(n)

        String min = words[0];
        String max = words[0];

        for(int i=0;i<words.length;i++)
        {
           if(min.length() > words[i].length())
           {
            min = words[i];
           } 

           if(max.length() < words[i].length())
           {
            max = words[i];
           }
        }

        System.out.println("Minimum length word : "+min);
        System.out.println("Maximum length word : "+max);
    }
}