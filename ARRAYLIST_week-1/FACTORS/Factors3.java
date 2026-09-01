import java.util.*;
class findingfactors{
    public ArrayList findfactor(int n)
    {
        ArrayList<Integer>l=new ArrayList<>();

        for(int i=1 ; i*i<=n ;i++)
        {
            if(n%i==0)
            l.add(i);
            if(n%i!=i)
             l.add(n/i);       
        }

            return l;
    }
}
public class Factors3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        findingfactors ff = new findingfactors();
       ArrayList<Integer>res= ff.findfactor(n);
     for(int x:res)
     System.out.print(x+" ");


    }
    
}