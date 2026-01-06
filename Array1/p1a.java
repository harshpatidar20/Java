// Find repeating element in a given Array of integers

// Examples:

// Input: {-1, 2, -1, 3, 0}
// Output: -1

// Input: {7, 4, 9, 6, 9, 4, 9}
// Output: 4,9


import java.util.*;                                          
                                          
public class p1a               
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n =sc.nextInt();
        System.out.print("Enter the values of array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++)                                                       // T.C. = O(n)  &&  S.C. = O(n)
        {
            arr[i]=sc.nextInt();
        }

       HashMap<Integer,Integer> map = new HashMap<>();

       for(int i=0;i<n;i++)
       {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
       }

       boolean first=true;
       
       HashSet<Integer> set=new HashSet<>();

       for(int i=0;i<n;i++)
       {
        if(map.get(arr[i])>1 && !set.contains(arr[i]))
        {
            if(!first)
            {
                System.out.print(",");
            }
            System.out.print(arr[i]);
            set.add(arr[i]);
            first=false;
        }
       }
    }
}
