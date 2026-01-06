// Program to convert a given number to words

// Given a non-negative integer n, the task is to convert the given number into its English representation according to International Number System.

// Examples:

// Input: n = 0
// Output: "Zero"

// Input: n = 123
// Output: "One Hundred Twenty Three"

// Input: n = 10245
// Output: "Ten Thousand Two Hundred Forty Five"

// Input: n = 2147483647
// Output: "Two Billion One Hundred Forty Seven Million Four Hundred Eighty Three Thousand Six Hundred Forty Seven"

import java.util.*;                          

public class p7                                   
{
    static String belowTwenty[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen",
                                "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};

    static String tens[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    static String thousands[] = {"","Thousand","Million","Billion"};

    public static String convertBelowThousand(int num)                             
    {
        if(num==0)
        {
            return "";
        }
        else if(num<20)                                                     // T.C. = O(log(n))   S.C. = O(1)
        {
            return belowTwenty[num]+" ";
        }
        else if(num<100)
        {
            return tens[num / 10] + " " + belowTwenty[num % 10];
        }
        else
        {
            return belowTwenty[num / 100] + " Hundred " + convertBelowThousand(num % 100);
        }
    }

    public static String numberToWords(int n) 
    {
        if (n == 0) 
        {
        return "Zero";
        }

        String result = "";
        int i = 0;

        while (n > 0) 
        {
            int chunk = n % 1000;
            if (chunk != 0) 
            {
                result = convertBelowThousand(chunk) + thousands[i] + " " + result;
            }
            n /= 1000;
            i++;
        }
        return result.trim();
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

         System.out.println(numberToWords(n));
    }
}