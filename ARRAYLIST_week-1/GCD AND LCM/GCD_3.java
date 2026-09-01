import java.util.*;

class Divisor{
    public int findGCD(int m,int n)
    {
        int r=0;
        while(m%n > 0)
        {
           r=m%n;
            n=m;
            m=r;
        }
        return r;
    }
}

public class GCD_3 {
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
