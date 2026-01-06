
// Tower of Hanoi - Print only Number of steps

// Given the number of disks n, print the total number of moves required to solve the Tower of Hanoi problem. You do not need to print the
// actual steps, just the number of steps.

// Formula : 

// The number of steps required to solve Tower of Hanoi with n disks is  :
// steps = 2^n -1

// Example :

// Input : 1
// Output : 1

        
import java.util.*;

public class p18                                        
{
   public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();

        long steps = (long)Math.pow(2, n) - 1;                                         //  T.C. = O(log n)    S.C. = O(1)

        System.out.println(steps);
    }
}

//    For very big input use this : 
//    BigInteger steps = BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE);                //  T.C. = O(n)   S.C. = O(n)
