// Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped 
// into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of 
// N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

// Example :

// Input : 7  -> Value of N

// [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

// Output : 0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

// Example 2: 

// input : 10  -> Value of N 

// [2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

// Output : 0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

// Explanation:

// In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity.


import java.util.*;

public class p5                                           
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Enter the values of arr : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)                                                    //  T.C. = O(n)    S.C. = O(1)
        {
            arr[i]=sc.nextInt();
        }

        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<n;i++)
        {
           if(arr[i]==0)
           {
            count0++;
           }
           else if(arr[i]==1)
           {
            count1++;
           }
           else if(arr[i]==2)
           {
            count2++;
           }
        }

        for(int i=0;i<count0;i++)
        {
            System.out.print(0+" ");
        }

        for(int i=0;i<count1;i++)
        {
            System.out.print(1+" ");
        }

        for(int i=0;i<count2;i++)
        {
            System.out.print(2+" ");
        }

    }
}




