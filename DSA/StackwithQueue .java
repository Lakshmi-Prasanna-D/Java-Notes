
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 class stack{
    Queue<Integer>q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    void push(int x){
        q2.add(x);
        
            while(!q1.isEmpty())
                  {
                    q2.add(q1.poll());
                  }
                  Queue<Integer> t=new LinkedList<>();
                  t=q1;
                  q1=q2;
                  q2=t;
                  
                  
        }
    
    int pop(){
        if(!q1.isEmpty())
            return q1.poll();
        return -1;

    }   
    int top(){
        if(!q1.isEmpty())
            return q1.peek(); 
        return -1;

    } 
    boolean isEmpty(){
        return q1.isEmpty();

    }
    
}
class StackwithQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack s=new stack();
        while (true) { 
            System.out.println("Enter your choice");
            System.out.println("1.Push 2.Pop 3.top 4.IsEmpty 5.Exit");
            int ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:System.out.println("Enter the value:");
                      int x=sc.nextInt();
                       s.push(x);
                       System.out.println("Entered "+x);break;
                case 2: int v=s.pop();
                        System.out.println(v);break;
                case 3: int t=s.top();
                          System.out.println("Top element is :"+t);
                          break;

               case 4: if(s.isEmpty())
                         System.out.println("The stack is Empty");
                       else
                           System.out.println("Stack is Not Empty");
                case 5: System.exit(0);
                default:System.out.println("Invalid Choice");

            }
            
        }
    }
        
    }
