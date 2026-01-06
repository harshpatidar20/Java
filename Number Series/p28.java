// Primitive Abundant Number

// A number N is said to be Primitive Abundant Number if N is an Abundant number and all it's proper divisors are Deficient Numbers. 
// The first few Primitive Abundant Numbers are:
 
// 20, 70, 88, 104, 272, 304......... 

// Check if N is a Primitive Abundant Number

// Given a number N, the task is to find if this number is Primitive Abundant Number or not. 

// Examples: 

// Input: N = 20 
// Output: YES 

// Explanation: 

// Sum of 20's proper divisors is - 1 + 2 + 4 + 5 + 10 = 22 > 20, 
// So, 20 is an abundant number. 
// The proper divisors of 1, 2, 4, 5 and 10 are 0, 1, 3, 1 and 8 respectively, 
// Each of these numbers is a deficient number 
// Therefore, 20 is a primitive abundant number.

// Input: N = 17 
// Output: No 
 
import java.util.*;                                       

public class p28                                                
{                                                                                           
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");                                           // T.C. = O(n^2)   S.C. = O(1)
        int n = sc.nextInt();

        int sum=0;

        for(int i=1;i<n;i++)          
        {
            if(n%i==0)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
            {
                sum+=i;
            }
        }

        if(sum<n)
        {
            System.out.println("NO");
        }

        if(sum>n)
        {
            for(int i=1;i<n;i++)          
            {
                if(n%i==0)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
                {
                    int sum1=0;
                    for(int j=1;j<i;j++)
                    {
                        if(i%j==0)
                        {
                            sum1+=j;
                        }
                    }

                    if(sum1>=i)
                    {
                        System.out.println("No");
                        return;
                    }
                }
            }
            
            System.out.println("YES");    
        }
    }
}