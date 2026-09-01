package PERFFECTSQUARE;
import java.util.*;
class myclass{
    public int isPerfectSquare(int n){
    int i=1;
     while(i*i<=n)
     {
        if(i*i == n){      
           return 1;
        
        }
        i++;
     }
     return 0;
    }
}
public class perfectsquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         
        System.out.println("Enter any number:");
        int m=sc.nextInt();
       
        myclass o=new myclass();
      int res= o.isPerfectSquare(m);
       if(res==1)
       System.out.println("The given number is perfect square");
       else
        System.out.println("The given number is not perfect square");
    }
}
