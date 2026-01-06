
// Temperature Classifier + Average

// Given two integer temperature values as a input , you are required to :

// Classify reach temperature based on the following rules:

// If temperature < 10 -> Print "it's very cool"
// If temperature is b/w 10 and 20 (inclusive) -> Print "it's cold"
// If temperature > 20 -> Print "it's warm"

// Print both classification results, separated by commas
// Calculate and print the average of the two temperatures as a double(with one decimal point precision if needed)
// Print both temperatures in reverse order (second temperature first, then the first)

// Input Format : 
// Two integers, separated by space

// Output Format :
// First line : classification of temperature 1 and temperature 2 (comma-separated)
// Second line : average of the two as a double
// Third line : the temperature in reverse order, space-separated

// Example : 

// Input :  5 25 

// Output : it's very cool, it's warm
//          15.0
//          25 5

import java.util.*;

public class p20
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter a value of b : ");
        int b=sc.nextInt();

        if(a<10)                                                                     //  T.C. = O(1)    S.C. = O(1)
        {
            System.out.print("it's very cool");
        }
        else if(a>=10 && a<=20)
        {
            System.out.print("it's cold");
        }
        else if(a>20)
        {
            System.out.print("it's warm");   
        }

        System.out.print(", ");

        if(b<10)
        {
            System.out.println("it's very cool");
        }
        else if(b>=10 && b<=20)
        {
            System.out.println("it's cold");
        }
        else if(b>20)
        {
            System.out.println("it's warm");   
        }

        double x = (a+b)/2.0;

        System.out.printf("%.1f\n",x);

        System.out.println(b+" "+a);
    }
}
          