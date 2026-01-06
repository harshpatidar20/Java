// Abundant Number

// A number n is said to be an Abundant Number if the sum of all the proper divisors of the number denoted by sum(n) is 
// greater than the value of the number n. And the difference between these two values is called abundance. 
// Mathematically, if the below condition holds the number is said to be an Abundant number:

// sum(n)> n
// abundance =  sum(n) - n
// sum(n): aliquot sum - The sum of all proper divisors of n

// Given a number n, our task is to find if this number is an Abundant number or not. 
// The first few Abundant Numbers are: 12, 18, 20, 24, 30, 36, 40, 42, 48, 54, 56, 60, 66 ..... 

// Examples:

// Input: 21
// Output: NO

// Input: 12
// Output: YES

// Input: 17
// Output: NO


import java.util.*;

public class p23
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int sum=0;

        for(int i=1;i<n;i++)                                               // T.C. = O(n)   S.C. = O(1)
        {
            if(n%i==0)
            {
                sum+=i;
            }
        }

        if(sum>n)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}




// Another method -> Optimized 

// import java.util.*;

// public class p23 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();

//         int sum = 1;                                                    // T.C. = O(√n)   S.C. = O(1)

//         for (int i = 2; i * i <= n; i++) {
//             if (n % i == 0) {
//                 sum += i;
//                 if (i != n / i) {
//                     sum += n / i;
//                 }
//             }
//         }

//         if (sum > n) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }
