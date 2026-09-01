import java.util.Scanner;

public class GCD_1
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
class Divisor{
    public int findGCD(int a , int b)
    {
      while(a!=b)
        {
            if(a>b)
               a=a-b;
            else 
               b=b-a;
                
        }
        return a;
    }
}