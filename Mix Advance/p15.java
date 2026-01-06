// A washing machine works on the principle of Fuzzy System, the weight of clothes put inside it for washing is uncertain But based on 
// weight measured by sensors, it decides time and water level which can be changed by menus given on the machine control area.  

// For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number 
// below that.

// For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.

// For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.

// Assume the capacity of machine is maximum 7000 grams

// Where approximately weight is zero, time estimate is 0 minutes.

// Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, 
// and for all other inputs, the output statement is

// “INVALID INPUT”.

// Input should be in the form of integer value –

// Output must have the following format –

// Time Estimated: Minutes

// Example:

// Input value
// 2000

// Output value
// Time Estimated: 25 minutes

import java.util.*;                                                     

public class p15
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int w=sc.nextInt();
     
        if(w==0)                                                                      // T.C. = O(1)    S.C. = O(1)
        {
            System.out.println("Time Estimated: 0 minutes");
        }
        else if(w>0 && w<=2000)
        {
            System.out.println("Time Estimated: 25 minutes");
        }
        else if(w>=2001 && w<=4000)
        {
            System.out.println("Time Estimated: 35 minutes");
        }
        else if(w>=4001 && w<=7000)
        {
            System.out.println("Time Estimated: 45 minutes");
        }
        else if(w>7000)
        {
            System.out.println("OVERLOADED");
        }
        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}