// QUESTION:
// Given an integer x, find the square root of x. If x is not a perfect square, then return floor(√x).

// Example:

// Input:
// x = 5
// Output: 2
// Explanation: Since 5 is not a perfect square, the floor of the square root of 5 is 2.

// Input:
// x = 4
// Output: 2
// Explanation: Since 4 is a perfect square, the square root of 4 is 2.

import java.util.*;

public class p16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int x = sc.nextInt();

        int result = (int) Math.sqrt(x);                                                // T.C. = O(1)     S.C. = O(1)
        System.out.println(result);

    }
}