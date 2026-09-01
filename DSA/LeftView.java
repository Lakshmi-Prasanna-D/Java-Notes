import java.util.*;
class Node{
    int data;
    Node left,right;
    public Node(int data)
    {
        this.data=data;
       left=null;
       right=null;
    }
}
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
   public void Inorder(Node root){
     if(root == null)
        return;
    Inorder(root.left);
    System.out.print(root.data +" ");
    Inorder(root.right);
   }
   public void Preorder(Node root){
     if(root == null)
        return;
    System.out.print(root.data +" ");
    Preorder(root.left);
       Preorder(root.right);
   }
   public void Postorder(Node root){
 if(root == null)
        return;
    Postorder(root.left);
      Postorder(root.right);
      System.out.print(root.data+" ");
   }
   public void leftView(Node root)
   {
    if(root==null){
         System.out.println("Tree Empty");
           return ;}
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    Node p=root;
    while(!q.isEmpty()){
        int n=q.size();
        for(int i=0;i<n;i++){
            p=q.poll();
            if(i==0)
                  System.out.println(p.data);
           if(p.left!=null)
                q.add(p.left);
            if(p.right!=null)
                   q.add(p.right);
        }
        
    }
   
   }

}
public class LeftView {
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
          Node root=null;
         while(true){
         System.out.println("\nEnter your Option");
         System.out.println("1.Insert, 2.POT ,3.IOT , 4.PostOT 5.leftview 6.Exit");
         int ch=sc.nextInt();
        
         BSTOperations a=new BSTOperations();
         switch(ch)
         {
            case 1: System.out.println("Enter the value");
                    int x=sc.nextInt();
                    root= a.InsertNode(root,x);break;
            case 2:a.Preorder(root);
                       break;
            case 3:a.Inorder(root);break;

            case 4:a.Postorder(root);break;
            case 5:a.leftView( root);break;
           
           case 6:System.exit(0);
           default:  System.out.println("Enter Valid input only");        
         }
        }
    }
}
