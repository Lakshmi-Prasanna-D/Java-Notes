import java.util.*;

class Divisor {
    public int findGCD(int a,int b)
    {
        int res=Math.min(a,b);
        while(res>0)
        {
            if(a%res==0 && b%res==0 )
              return res;
            else res--;
        }
        return res;
    }
}
public class GCD_2
{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st number ");
        a=sc.nextInt();
        System.out.println("Enter the 1st number ");
        b=sc.nextInt();
        Divisor p=new Divisor();
        int res=p.findGCD(a,b);
        
        System.out.println("The GCD is "+res);
        sc.close();
    }
}