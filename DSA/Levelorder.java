import java.util.Scanner;
class BSTOperations{
    public Node InsertNode(Node root,int x){
         Node temp=new Node(x);
        if(root==null)
        {
          // Node temp=new Node(x);
           return temp;
        }
        else{
            Node par=null,curr=root;
            while(curr!=null)
            {
                par=curr;
                if(x<curr.data)
                     curr=curr.left;
                else if(x>curr.data)
                       curr=curr.right;
                else{
                    System.out.println("Duplicates not allowed");
                       return root;
                }

            }
            if(x<par.data)
                  par.left=temp;
            else 
                 par.right=temp;

        }
        return root;
    }

   int getCount(Node root)
   {
       if(root==null)
           return 0;
        else if(root.left==null  && root.right==null)
              return 1;
        else
          return getCount(root.left)+getCount(root.right);
   }
   }
public class Levelorder {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          Node root=null;
         while(true){
         System.out.println("\nEnter your Option");
         System.out.println("1.Insert, 2.CountLeafs 3.Exit");
         int ch=sc.nextInt();
        
         BSTOperations a=new BSTOperations();
         switch(ch)
         {
            case 1: System.out.println("Enter the value");
                    int x=sc.nextInt();
                    root= a.InsertNode(root,x);break;
            case 2: int s=a.getCount(root);System.out.println(s);
                       break;
            case 3:System.exit(0);
           default:  System.out.println("Enter Valid input only");        
         }
        }
}
}