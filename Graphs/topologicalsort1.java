
import java.util.*;
class Graph{
     int n;
     ArrayList<ArrayList<Integer>> al;
     public Graph(int n){
        this.n=n;
        al=new ArrayList<>();
        for(int i=0;i<n;i++)
              al.add(new ArrayList<>());
        }
     void add(int u , int v)
     {
       
        al.get(u).add(v);
        //al.get(v).add(u);

     }
     void display(){
        

        for(int i=0;i<n;i++){
            System.out.print("Vertex:"+i+":");
            System.out.println(al.get(i));
        }
     }
     void dfs(int s,boolean visited[],Stack<Integer> st){
       
        visited[s]=true;
        for(int x:al.get(s)){
         if(!visited[x]){
                visited[x]=true;
                dfs(x,visited,st);
            }       

        }
        st.push(s);
    }
    List<Integer> topologicalsort(){
         boolean visited[]=new boolean[n];
         Stack<Integer> st=new Stack<>();
         List<Integer> res=new ArrayList<>();
         for(int i=0;i<n;i++){
            if(!visited[i])
                 dfs(i,visited,st);
         }
         while(!st.isEmpty())
              res.add(st.pop());
    return res;

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
              // visited[i]=true;
               q.add(i);
            }
         }
      }
    }
}

class topologicalsort1{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Graph o=new Graph(n);
        System.out.println("Enter  no of connections ");
        int c=sc.nextInt();
        for(int i=0;i<c;i++)
        {
            System.out.println("Enter u ,v");
             int u=sc.nextInt();
          
             int v=sc.nextInt();
             o.add(u,v);

        }
        System.out.println("The graph is");
        o.display();
       System.out.println("Topological sort is:");
      List<Integer> res= o.topologicalsort();
      System.out.println(res);

      sc.close();
}
}