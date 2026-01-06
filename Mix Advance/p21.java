// FULLY AUTOMATIC VENDING MACHINE – dispenses your cuppa on just press of button. A vending machine can serve range of products as follows:

// Coffee

// Espresso Coffee
// Cappuccino Coffee
// Latte Coffee

// Tea

// Plain Tea
// Assam Tea
// Ginger Tea
// Cardamom Tea
// Masala Tea
// Lemon Tea
// Green Tea
// Organic Darjeeling Tea

// Soups 

// Hot and Sour Soup
// Veg Corn Soup
// Tomato Soup
// Spicy Tomato Soup

// Beverages

// Hot Chocolate Drink
// Badam Drink
// Badam-Pista Drink

// Write a program to take input for main menu & sub menu and display the name of sub menu selected in the following format 
// (enter the first letter to select main menu):

// Welcome to CCD 
// Enjoy your
// Example 1:

// Input:
// c
// 1
// Output
// Welcome to CCD!
// Enjoy your Espresso Coffee!

// Example 2:
// Input:
// t
// 9
// Output
// INVALID INPUT

import java.util.*;

public class p21
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        int n=sc.nextInt();

        if(ch=='c')                                                      // T.C. = O(1)    S.C. = O(1)
        {
            if(n==1)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Espresso Coffee!");
            }
            else if(n==2)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Cappuccino Coffee!");
            }
            else if(n==3)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Latte Coffee!");
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
           

        else if(ch=='t')
        {
            if(n==1)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Plain Tea!");
            }
            else if(n==2)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Assam Tea!");
            }
            else if(n==3)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Ginger Tea!");
            }
            else if(n==4)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Cardamom Tea!");
            }
            else if(n==5)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Masala Tea!");
            }
            else if(n==6)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Lemon Tea!");
            }
            else if(n==7)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Green Tea!");
            }
            else if(n==8)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Organic Darjeeling Tea!");
            }
            else
            {
                System.out.println("INVALID INPUT");
            }

        }

        else if(ch=='s')
        {
            if(n==1)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Hot and Sour Soup!");
            }
            else if(n==2)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Veg Corn Soup!");
            }
            else if(n==3)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Tomato Soup!");
            }
            else if(n==4)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Spicy Tomato Soup!");
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
           
        }

        else if(ch=='b')
        {
            if(n==1)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Hot Chocolate Drink!");
            }
            else if(n==2)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Badam Drink!");
            }
            else if(n==3)
            {
                System.out.print("Welcome to CCD!\nEnjoy your Badam-Pista Drink!");
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }

        else
        {
            System.out.println("INVALID INPUT");
        }
    }
}