// Convert Roman Numeral to Integer

// Problem: Convert a Roman numeral (e.g., XIV) to an integer.

// Example 

// Input: XIV
// Output: 14

import java.util.*;                                                    

public class p11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        String str = sc.nextLine();                                         

        Map<Character,Integer> hm = new HashMap<>();                           // T.C. = O(n)   S.C. = O(1)
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result=0;
        for(int i=0;i<str.length()-1;i++)
        {
            int curr=hm.get(str.charAt(i));
            int next=hm.get(str.charAt(i+1));
            if(curr<next)
            {
                result-=curr;
            }
            else
            {
                result+=curr;
            }
        }
        
        result+=hm.get(str.charAt(str.length()-1));

        System.out.print(result);
    }
}