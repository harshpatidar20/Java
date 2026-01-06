
// Program to find Prime Numbers b/w given Interval

// Given two numbers m and n as interval range, the task is to find the prime numbers in b/w this interval.

// Examples : 

// Input : m=1,n=10
// Output : 2 3 5 7 

// Input : m=10,n=20
// Output : 11 13 17 19


import java.util.*;

public class p13                                          
{
    public static boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        // for(int j=2;j<n;j++)
        for(int j=2;j*j<=n;j++)
        //for(int j=2;j<=n/2;j++)                                                     //  T.C. = O((n√n)    S.C. = O(1)
            {
                if(n%j==0)
                {
                    return false;
                }
            }
            return true;
    }
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number m : ");
        int m = sc.nextInt();
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();


        for(int i=m;i<=n;i++){
           if(isPrime(i)){
            System.out.print(i+" ");
           } ;
        }

        //System.out.println(isPrime(7));
        
        //System.out.println(isPrime(10));
    }
}