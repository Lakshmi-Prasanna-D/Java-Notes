import java.util.Scanner;
class Myclass{
    public int  findLCM(int m,int n)
    {
        int x=Math.max(m,n);
        int y=Math.min(m,n);
        for(int i=x; i<=m*n ; i=i+x)
        {
            if(i%y==0)
              return i;
        }
        return m*n;
    }
}
public class LCM_noGCD {
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
