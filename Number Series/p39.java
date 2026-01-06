import java.util.*;

public class p39
{
    public static void main(String gg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int sum=0;
        int mul=0;

        for(int i=0;i<n;i++)
        {
            mul=mul*10 + 1;
        }
        while(mul!=0)
        {
            int digit=mul%10;
            sum+=Math.pow(digit,2);
            mul=mul/10;
        }

        System.out.print(sum);
    }
}