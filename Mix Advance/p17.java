// We want to estimate the cost of painting a property. Interior wall painting cost is Rs.18 per sq.ft. and exterior wall painting cost 
// is Rs.12 per sq.ft.

// Take input as
// 1. Number of Interior walls
// 2. Number of Exterior walls
// 3. Surface Area of each Interior 
// 4. Wall in units of square feet
// Surface Area of each Exterior Wall in units of square feet

// If a user enters zero  as the number of walls then skip Surface area values as User may don’t  want to paint that wall.

// Calculate and display the total cost of painting the property

// Example 1:
// 6
// 3
// 12.3
// 15.2
// 12.3
// 15.2
// 12.3
// 15.2
// 10.10
// 10.10
// 10.00
// Total estimated Cost : 1847.4 INR

// Note: Follow in input and output format as given in above example

// import java.util.*;

// public class p17
// {
//     public static void main(String gg[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the value of I : ");
//         int I=sc.nextInt();
//         System.out.print("Enter the value of E : ");
//         int E=sc.nextInt();
  
//         float arr1[]=new float[I];                                                  // T.C. = O(I + E)    S.C. = O(I + E)
//         for(int i=0;i<I;i++)
//         {
//             arr1[i]=sc.nextFloat();
//         }

//         float arr2[]=new float[E];
//         for(int i=0;i<E;i++)
//         {
//             arr2[i]=sc.nextFloat();
//         }
        
//         float sum1=0;

//         for(int i=0;i<I;i++)
//         {
//             sum1+=arr1[i];
//         }

//         float result1=sum1*18;

//         float sum2=0;

//         for(int i=0;i<E;i++)
//         {
//             sum2+=arr2[i];
//         }

//         float result2=sum2*12;

//         float result=result1+result2;

//         System.out.println("Total estimated Cost : "+result+" INR");
//     }
// }


import java.util.*;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int I = sc.nextInt();  // Number of interior walls                       // T.C. = O(I + E)    S.C. = O(1)
        int E = sc.nextInt();  // Number of exterior walls

        float sum1 = 0; // Interior total
        for (int i = 0; i < I; i++) {
            sum1 += sc.nextFloat();
        }

        float sum2 = 0; // Exterior total
        for (int i = 0; i < E; i++) {
            sum2 += sc.nextFloat();
        }

        float result = (sum1 * 18) + (sum2 * 12);

        System.out.println("Total estimated Cost : " + result + " INR");
    }
}
