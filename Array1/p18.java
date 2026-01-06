// In an sorted array elements are appearing exactly 2 times so return the one which is appearing only once
// ex:-
// arr={1,1,2,3,3,4,4,5,5} 
// o/p- 2

// and you have to solve in log(n) time

// import java.util.*;

// public class p18
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the size of array : ");
//         int n=sc.nextInt();
//         System.out.print("Enter the values of array : ");
//         int arr[] = new int[n];

//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0;i<n;i++)                                             // T.C. = O(n^2)  &&  S.C. = O(n)
//         {
//             int count=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count==1)
//             {
//                 System.out.print(arr[i]+" ");
//             }
//         }
//     }
// }



import java.util.*;                            

public class p18
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();      //NOT COMPLETED
        }

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                if(arr[i]==arr[i+1])
                {
                    break;
                }
            }
        }
    }
}