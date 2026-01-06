// Joseph is learning digital logic subject which will be for his next semester. He usually tries to solve unit assignment problems 
// before the lecture. Today he got one tricky question. The problem statement is “A positive integer has been given as an input. 
// Convert decimal value to binary representation. Toggle all bits of it after the most significant bit including the most significant bit. 
// Print the positive integer value after toggling all bits”.

// Constrains-

// 1<=N<=100

// Example 1:

// Input :

// 10  -> Integer

// Output :

// 5    -> result- Integer

// Explanation:

// Binary representation of 10 is 1010. After toggling the bits(1010), will get 0101 which represents “5”. Hence output will print “5”.

import java.util.*;                              

public class p3                       
{
    public static void main(String gg[])                      
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");                        
        int n = sc.nextInt();
        
        int len=Integer.toBinaryString(n).length();                                    //  T.C. = O(log n)    S.C. = O(1)
        int mask=(1<<len)-1;

        int result=n^mask;

        System.out.println(result);
    }
}