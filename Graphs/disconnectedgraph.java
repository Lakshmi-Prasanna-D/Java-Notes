import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class disconnecedgraph {
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
        boolean val=o.isconnected();
        if(val)
            System.out.print("Connected");
        else
        System.out.println("Disconneced");
        /*while(true){
        System.out.println("Enter the start node to Traverse:");
        int s=sc.nextInt();
        
       List<Integer>res=new ArrayList<>();
       res=o.dfs1(s,visited);
        System.out.println(res);

        }*/
    }
}
class Graph{
     int n;
     int mat[][];
     Graph(int n){
        this.n=n;
        mat=new int[n][n];
     }
     void add(int u , int v)
     {
        mat[u][v]=1;
        mat[v][u]=1;

     }
     void display(){
         for (int i = 0; i < n; i++) {
        System.out.print("  "+i);
         }
        System.out.println();

        for(int i=0;i<n;i++){
            System.out.print(i+" ");
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }

     }
     boolean isconnected(){
          boolean visited[]=new boolean[n];
          int c=0;
          for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,visited);
                c++;
                if(c>1)
                     return false;
                      
            }
            
          }
          return true;
     }
     void dfs(int s,boolean visited[]){
       // res.add(s);
        visited[s]=true;
        
        for(int i=0;i<n;i++){
            if(mat[s][i]==1 && !visited[i]){
                visited[i]=true;
                dfs(i,visited);
            }

        }
    }
        List<Integer> dfs1(int s, boolean visited[]){
            Stack<Integer> st=new Stack<>();
            List<Integer> res=new ArrayList<>();
            st.push(s);
            res.add(s);
            visited[s]=true;
            while(!st.isEmpty()){
                int cur=st.pop();
                for(int i=0;i<n;i++){
                    if(mat[cur][i]==1 && !visited[i]){
                        visited[i]=true;
                        st.push(i);
                        res.add(i);
                        }
                }

            }

      return res;
        
     }
}