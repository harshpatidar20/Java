// Convert Decimal to Hexadecimal

// Problem: Convert a decimal number to hexadecimal (without using Integer.toHexString).

// Example 

// Input: 255
// Output: FF

// import java.util.*;

// public class p9
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();

//         StringBuilder sb = new StringBuilder();                                       // T.C. = O(log n)   S.C. = O(log n)

//         String s = "0123456789ABCDEF";

//         while(n!=0)
//         {
//             int digit = n%16;
//             sb.append(s.charAt(digit));
//             n=n/16;
//         }

//         System.out.print(sb.reverse().toString());
//     }
// }




import java.util.*;                                                

public class p9
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();                                                              // T.C. = O(log n)   S.C. = O(log n)

        String str=Integer.toHexString(n).toUpperCase();

        System.out.println(str);
    }
}