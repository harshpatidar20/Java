// Selection of MPCS exams include a fitness test which is conducted on ground. There will be a batch of 3 trainees, appearing for running 
// test in track for 3 rounds. You need to record their oxygen level after every round. After trainee are finished with all rounds, 
// calculate for each trainee his average oxygen level over the 3 rounds and select one with highest oxygen level as the most fit trainee. 
// If more than one trainee attains the same highest average level, they all need to be selected.

// Display the most fit trainee (or trainees) and the highest average oxygen level.

// Note:

// The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
// If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees as unfit with 
// meaningful message as “All trainees are unfit.
// Average Oxygen Values should be rounded.
// Example 1:
// INPUT VALUES
// 95
// 92
// 95
// 92
// 90
// 92
// 90
// 92
// 90

// OUTPUT VALUES
// Trainee Number : 1
// Trainee Number : 3

// Note:
// Input should be 9 integer values representing oxygen levels entered in order as

// Round 1

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3
// Round 2

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3
// Round 3

// Oxygen value of trainee 1
// Oxygen value of trainee 2
// Oxygen value of trainee 3

// Output must be in given format as in above example. For any wrong input final output should display “INVALID INPUT”

import java.util.*;

public class p14
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the values : ");                 
        int arr[]=new int[9];

        for(int i=0;i<9;i++)                                                               // T.C. = O(1)    S.C. = O(1)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<1 || arr[i]>100)
            {
                System.out.println("INVALID INPUT");
                return;
            }
        }

        int sum1=0;
        int sum2=0;
        int sum3=0;

        sum1+=arr[0]+arr[3]+arr[6];
        sum2+=arr[1]+arr[4]+arr[7];
        sum3+=arr[2]+arr[5]+arr[8];        

        int avg1=sum1/3;
        int avg2=sum2/3;
        int avg3=sum3/3;

        int max=Math.max(avg1,Math.max(avg2,avg3));

        if(max<70)
        {
            System.out.println("All trainees are unfit");
        }

        if(avg1==max)
        {
            System.out.println("Trainee Number :"+1);
        }
        
        if(avg2==max)
        {
            System.out.println("Trainee Number :"+2);
        }
        
        if(avg3==max)
        {
            System.out.println("Trainee Number :"+3);
        }
        
    }
}