
// Count the number of unique characters in a string

import java.util.*;

public class p27
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str=sc.nextLine();

        HashSet<Character> ls=new HashSet<>();                                   // T.C = O(n)    S.C. = O(n)

        for(int i=0;i<str.length();i++)
        {
            ls.add(str.charAt(i));
        }

        System.out.println(ls.size());
    }
}

// I used HashSet because it automatically stores only unique values.
// So when I add characters from the string, duplicates are removed by default.
// At the end, I just check the size of the HashSet to get the count of unique characters.