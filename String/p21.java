// Lexicographically next string

// Given a string, find lexicographically next string.

// Examples: 

// Input : geeks
// Output : geekt
// The last character 's' is changed to 't'.
// Input : raavz
// Output : raawz
// Since we can't increase last character, 
// we increment previous character.
// Input :  zzz
// Output : zzza
// If string is empty, we return 'a'. If string contains all characters as 'z', we append 'a' at the end. Otherwise we 
// find first character from end which is not z and increment it.


import java.util.*;                            // IMP

public class p21                                       
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=sc.nextLine();

        if(str.length()==0)
        {
            System.out.println("a");
            return;
        }

        StringBuilder result = new StringBuilder(str);

        boolean flag=false;
        for(int i=result.length()-1;i>=0;i--)
        {
            char ch=result.charAt(i);
            if(ch!='z')
            {
                flag=true;
                result.setCharAt(i,(char)(ch+1));
                break;
            }
        }

        if(!flag)
        {
            result.append('a');
        }
        System.out.print(result.toString());
    }
}