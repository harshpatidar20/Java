// Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends. 

// So every time when the months starts he counts the number of sundays he will get to enjoy. Considering the month can start with any day, 
// be it Sunday, Monday…. Or so on.

// Count the number of Sunday jack will get within n number of days.

//  Example 1:

// Input 

// mon-> input String denoting the start of the month.

// 13  -> input integer denoting the number of days from the start of the month.

// Output :

// 2    -> number of days within 13 days.

// Explanation:

// The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next Sunday in next 7 days and so on.

// Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up in another sunday. 
// Total 2 sundays may fall within 13 days.

import java.util.*;

public class p4                                       
{
    public static void main(String gg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        String days[]= {"Mon","Tues","Wed","Thur","Fri","Sat","Sun"};

        int count=0;

        int startIndex = -1;
        
        for(int i=0;i<days.length;i++)
        {
            if(days[i].equalsIgnoreCase(str))
            {
                startIndex=i;
                break;
            }
        } 

        int distance = (6 - startIndex + 7) % 7;

        if(distance<n)
        {
            count=1+(n-distance)/7;
        }

        System.out.println(count);
    }
}