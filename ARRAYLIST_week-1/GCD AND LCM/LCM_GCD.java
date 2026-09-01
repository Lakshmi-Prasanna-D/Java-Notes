
import java.util.*;
class Myclass
{
  public int findLCM(int m,int n)
  {
   // Myclass ob=new Myclass();

    int val=findGCD(m,n);
    return (m*n)/val;
  }
  public int findGCD(int m,int n)
  {
    while(m!=n)
    {
        if(m>n)
          m=m-n;
        else n=n-m;
    }
    return m;
  }
}
public class LCM_GCD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int m=sc.nextInt();
        System.out.println("Enter second number:");
        int n=sc.nextInt();
        Myclass obj=new Myclass();
       int res= obj.findLCM(m,n);
       System.out.println("The LCM is:"+res);

    }
}
