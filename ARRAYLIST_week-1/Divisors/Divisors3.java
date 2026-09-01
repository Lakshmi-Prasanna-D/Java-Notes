
import java.util.*;
class findingdivisor{
    public ArrayList<Integer> findfactor(int n)
    {
        ArrayList<Integer>l=new ArrayList<>();

        for(int i=1 ; i*i<=n ;i++)
        {
            if(n%i==0)
              l.add(i);
            if(n/i!=0)
             l.add(n/i);       
        }
      
            return l;
            
    }
}
public class Divisors3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        findingdivisor ff = new findingdivisor();
         
     ArrayList<Integer>res=ff.findfactor(n);
        System.out.println("The no.of factors are:"+res.size());
        for(int x:res)
     System.out.print(x+" ");
   


    }
    
}