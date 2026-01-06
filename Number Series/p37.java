// Program to find area of a circle

// Given the radius r. Find the area of a circle. The area of the circle should be correct up to 5 decimal places.

// Examples:

// Input: r = 5
// Output: 78.53982
// Explanation: As area = PI * r * r = 3.14159265358979323846 * 5 * 5 = 78.53982, as we only keep 5 digits after decimal.

// Input: r = 2
// Output: 12.56637
// Explanation: As area = PI * r * r = 3.14159265358979323846 * 2 * 2 = 12.56637, as we only keep 5 digits after decimal.

import java.util.*;

public class p37
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        double area = 3.14159265358979323846 * r * r;                 // T.C. = O(log n)   S.C. = O(1)

        System.out.printf("%.5f", area);
    }
}