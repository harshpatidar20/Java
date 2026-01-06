// Program to find the Roots of a Quadratic Equation

// Given a quadratic equation in the form ax2 + bx + c, (Only the values of a, b and c are provided) the task is to find the roots of the equation.

// Examples:

// Input:  a = 1, b = -2, c = 1
// Output:  Roots are real and same 1

// Input  :  a = 1, b = 7, c = 12
// Output:  Roots are real and different
// -3, -4

// Input  :  a = 1, b = 1, c = 1
// Output :  Roots are complex 
// -0.5 + i1.73205, -0.5 - i1.73205  

import java.util.*;
                              
public class p38                                                      
{
    public static void main(String agrs[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        int d = b*b - 4*a*c;

        double x1=(-b + Math.sqrt(d))/2*a;
        double x2=(-b - Math.sqrt(d))/2*a;      


        if(d==0)
        {
            System.out.println("Roots are real and same "+x1);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and different "+x1+" "+x2);
        }
        else if(d<0)
        {
            System.out.println("Roots are complex");
        }
    }
}