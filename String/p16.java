// Toggle the Case of Each Character in a String

// Given a string s consisting of English letters (both uppercase and lowercase), convert each character to its opposite case that is, 
// change every lowercase letter to uppercase, and every uppercase letter to lowercase.

// Examples: 

// Input : s = "geeksForgEeks"
// Output : "GEEKSfORGeEKS"
// Explanation : All lower case characters are changed into upper case and vice versa.

// Input : s = "capiTAlize"
// Output : "CAPItaLIZE"
// Explanation : All lower case characters are changed into upper case and vice versa.

// Input : s = "SMALLcase"
// Output : "smallCASE"
// Explanation : All lower case characters are changed into upper case and vice versa.

import java.util.*;

public class p16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        StringBuilder result=new StringBuilder();                                       // T.C = O(n)    S.C. = O(n)

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                result.append(Character.toUpperCase(ch));
            }
            else if(Character.isUpperCase(ch))
            {
                result.append(Character.toLowerCase(ch));
            }
            else
            {
                result.append(ch);  //if not letter like space or digits 
            }
        }
        System.out.print(result.toString());
    }
}


// When i use simple methods -> // T.C = O(n)    S.C. = O(1)  but in this if space between characters then this method is not work ,use above method 

// import java.util.*;

// public class p16
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the String : ");
//         String str=sc.nextLine();

//         for(int i=0;i<str.length();i++)
//         {
//             char ch=str.charAt(i);
//             if(ch>=65 && ch<=90)
//             {
//                 ch+=32;
//             }
//             else if(ch>=97 && ch<=122)
//             {
//                 ch-=32;
//             }
//             System.out.print(ch);
//         }
//     }
// }