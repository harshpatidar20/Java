
// You are given a range [L,U] and a list of N elements. The task is to find the leftover elements in the range[L,U] that are not present 
// int the given list A. The output should group consecutive leftover elements into separate lists.

// Constraints :
// 1<=L<=U<=1000
// 0<=N<=(U-L+1)
// L<=A[i]<=U

// Example-1 :

// Input :  1  10  1
//          5
// Output : [1 4] [6 10]

import java.util.*;                                         

public class p12                                           
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of L : ");
        int L = sc.nextInt();
        System.out.print("Enter the number of U : ");
        int U = sc.nextInt();
        System.out.print("Enter the number of N : ");
        int N = sc.nextInt();

        HashSet<Integer> set=new HashSet<>();                                  // T.C. = O(N + (U-L+1))   S.C. = O(N)

        for(int i=0;i<N;i++)
        {
            set.add(sc.nextInt());
        }

        int start=0;
        int prev=0;

        boolean found=false;
        for(int i=L;i<=U;i++)
        {
            if(!set.contains(i))
            {
                if(found==false)
                {
                    start=i;
                    found=true;
                }
                prev=i;
            }
            else
            {
                if(found==true)
                {
                    System.out.print("["+start+" "+prev+"]"+" ");
                    found=false;
                }
            }
        }

        if(found==true)
        {
            System.out.print("["+start+" "+prev+"]"+" ");
        }
    }
}