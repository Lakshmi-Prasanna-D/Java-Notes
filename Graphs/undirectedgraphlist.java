import java.util.*;
class Graph{
     int n;
     ArrayList<ArrayList<Integer>> al;
     public Graph(int n){
        this.n=n;
        for(int i=0;i<n;i++)
              al.add(new ArrayList<>());
        }
     void add(int u , int v)
     {
       
        al.get(u).add(v);
        al.get(v).add(u);

     }
     void display(){
        

        for(int i=0;i<n;i++){
            System.out.print("Vertex:"+i+":");
            System.out.println(al.get(i));
        }
     }
     void dfs(int s,boolean visited[],List<Integer> res){
        res.add(s);
        visited[s]=true;
        for(int x:al.get(s)){
         if(!visited[x]){
                visited[x]=true;
                dfs(x,visited,res);
            }       

        }
    }
    void bfs(int s){
      Queue<Integer> q=new LinkedList<>();
      q.add(s);
      boolean visited[]=new boolean[n];
      while(!q.isEmpty()){
         int x=q.poll();
         for(int i:al.get(x)){
            if(!visited[i])
            {
               visited[i]=true;
               q.add(i);
            }
         }
      }
    }
}
public class undirectedgraphlist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Graph o=new Graph(n);
        System.out.println("Enter  no of connections ");
        int c=sc.nextInt();
        for(int i=0;i<c;i++)
        {
            System.out.println("Enter connection (u ,v) "+i);
             int u=sc.nextInt();
          
             int v=sc.nextInt();
             o.add(u,v);

        }
        System.out.println("The graph is");
        o.display();
         while(true){
        System.out.println("Enter the start node to Traverse:");
        int s=sc.nextInt();
        boolean visited[]=new boolean[n];
       List<Integer>res=new ArrayList<>();
         o.bfs(s);
        System.out.println(res);
        }
       // Deque<Integer> dq=new Deque<Integer>() ;
}
}