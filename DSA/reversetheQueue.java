//construct a queue with n elements and reverse the contents of queue
//there are 2 techniques here 1.using stack and 2. using reccursion

//using Reccursion
import java.util.*;
public class reversetheQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter n");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)

                {
                    
                      q.add(sc.nextInt());
                }
                System.out.println("Reversing the Queue");
                q=reverse(q);
                System.out.println(q);
    }
    static Queue<Integer> reverse (Queue<Integer> q)
    {
      if(q.isEmpty())
        return  new LinkedList<>();
       else{
        int x=q.poll();
        reverse(q);
        q.add(x);
        
       }
       return q;
       
    }
}
