// A doctor has a clinic where he serves his patients. The doctor’s consultation fees are different for different groups of patients 
// depending on their age. If the patient’s age is below 17, fees is 200 INR. If the patient’s age is between 17 and 40, fees is 400 INR. 
// If patient’s age is above 40, fees is 300 INR. Write a code to calculate earnings in a day for which one array/List of values 
// representing age of patients visited on that day is passed as input.
// Note:

// Age should not be zero or less than zero or above 120
// Doctor consults a maximum of 20 patients a day
// Enter age value (press Enter without a value to stop):

// Example 1:

// Input
// 20
// 30
// 40
// 50
// 2
// 3
// 14

// Output
// Total Income 2000 INR

// Note: Input and Output Format should be same as given in the above example.
// For any wrong input display INVALID INPUT

// Output Format
// Total Income 2000 INR

import java.util.*;                   

public class p22                                           
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();                                                 // T.C. = O(n)    S.C. = O(1)
        
        if(n<=0 || n>20)
        {
            System.out.println("INVALID INPUT");
            return;
        }
       
        int count=0;

        for(int i=0;i<n;i++)
        {
            int age=sc.nextInt();

            if(age<=0 || age>120)
            {
                System.out.println("INVALID INPUT");
                return;
            }
        if(age<17)
        {
            count+=200;
        }
        else if(age<=40)
        {
            count+=400;
        }
        else
        {
            count+=300;
        }
    }

    System.out.print("Total Income "+count+" INR");

    }
}