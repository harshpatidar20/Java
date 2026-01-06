
// Write a java program to move all negative elements to the start of thr array ?

// Input : {-1,-20,30,40,50,-8}

// Output : {-1,-20,-8,30,40,50}

import java.util.*;                                        

public class p41
{
    public static void main(String[] args)                              
    {
        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();

        if(str.startsWith("{") && str.endsWith("}"))                      // T.C. = O(n)  &&  S.C. = O(n)
        {
            str=str.substring(1,str.length()-1);
        }

        String s[]=str.split(",");

        int arr[]=new int[s.length];

        for(int i=0;i<s.length;i++)
        {
            arr[i]=Integer.parseInt(s[i]);
        }

       ArrayList<Integer> result=new ArrayList<>();

       for(int i=0;i<arr.length;i++)
       {
       if(arr[i]<0)
       {
           result.add(arr[i]);
       }
       }

       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]>=0)
        {
            result.add(arr[i]);
        }
       }

        System.out.print("{");
        for(int i=0;i<result.size();i++)
        {
            System.out.print(result.get(i));
            if(i!=result.size()-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");





        // System.out.print("Enter the size of array : ");
        // int n =sc.nextInt();
        // System.out.print("Enter the values of array : ");
        // int arr[] = new int[n];

        // for(int i=0;i<n;i++)                                                              // T.C. = O(n)  &&  S.C. = O(1)
        // {
        //     arr[i]=sc.nextInt();
        // }

        // int j=0;

        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]<0)
        //     {
        //         int a=arr[i];
        //         arr[i]=arr[j];
        //         arr[j]=a;
        //         j++;
        //     }
        // }

        // for(int i=0;i<n;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }
    }
}