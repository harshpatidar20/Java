// Remove all characters other than alphabets from string

// Given a string consisting of alphabets and others characters, remove all the characters other than alphabets and print the string so formed. 

// Examples: 

// Input : $Gee*k;s..fo, r'Ge^eks?
// Output : GeeksforGeeks

// Input : P&ra+$BHa;;t*ku, ma$r@@s#in}gh
// Output : PraBHatkumarsingh


import java.util.*;

public class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        for(int i=0;i<str.length();i++)                                                   // T.C = O(n)    S.C. = O(1)
        {
            if(Character.isLetter(str.charAt(i))) 
            {
                System.out.print(str.charAt(i));
            }      
        }
    }
}