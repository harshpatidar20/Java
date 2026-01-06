// Program for Binary To Decimal Conversion

// Given a binary number as input, we need to write a program to convert the given binary number into an equivalent decimal number.

// Examples : 

// Input : 111
// Output : 7
// Explanation : The output of 7 for input 111 represents the decimal equivalent of the binary number 111.

// Input : 1010
// Output : 10
// Explanation : The output of 10 for input 1010 represents the decimal equivalent of the binary number 1010.

// Input: 100001
// Output: 33
// Explanation : The output of 33 for input 100001 represents the decimal equivalent of the binary number 100001.

import java.util.*;

public class p1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String n = sc.next();

        int d=Integer.parseInt(n,2);                                                 // T.C. = O(n)   S.C. = O(n)

        System.out.println(d);

    }
}



// import java.util.*;

// public class p1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter binary number: ");
//         String str = sc.next();

//         int decimal = 0;
//         int power = 0;

//         // Loop from last digit to first
//         for (int i = str.length() - 1; i >= 0; i--) {                                      // T.C. = O(n)   S.C. = O(1)
//             char ch = str.charAt(i);
//             if (ch == '1') {
//                 decimal += Math.pow(2, power);
//             }
//             power++;
//         }

//         System.out.println("Decimal: " + decimal);
//     }
// }
