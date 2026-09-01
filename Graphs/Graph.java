import java.util.*;
public class Graph{
    int n;
    int mat[][];
    Graph(int n){
         this.n=n;
        mat=new int[n][n];
       
    }
    void addEdge(int u,int v){
        mat[u][v]=1;
        mat[v][u]=1;
    }
    void display(){
        for(int i=0;i<n;i++)
            System.out.print("\t"+i);
           System.out.println();
        for(int i=0;i<n;i++){
            System.out.print(i+"\t");
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    }
    List<Integer> dfs(int s){
        boolean visited[]=new boolean[n];
        List<Integer> res=new ArrayList<>();
        dfs1(s,visited,res);
        for(int i=0;i<n;i++){
            if(!visited[i])
              dfs1(i, visited, res);
        }
        return res;
    }
    void dfs1(int s,boolean visited[]){
        visited[s]=true;
      //  res.add(s);
        for(int i=0;i<n;i++){
            if(mat[s][i]==1 && !visited[i])
                dfs1(i,visited);
        }
       // return res;
    }
     boolean isconnected(){
          boolean visited[]=new boolean[n];
          int c=0;
          for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs1(i,visited);
                c++;
                if(c>1)
                     return false;
                      
            }
            
          }
          return true;
     }

}
class disconnectedgraph{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int max=((n)*(n-1))/2;
        Graph g=new Graph(n);
        while(max>0){
            System.out.println("Enter the source and destination(u,v):");
            System.out.println("Enter -1 -1 to quit:");
            int u=sc.nextInt();
            int v=sc.nextInt();
            if (u==-1 || v==-1)
                 break;
            else{
                g.addEdge(u,v);
            }
            max--;
        }
        g.display();
        //System.out.println("Enter the start index:");
        //int s=sc.nextInt();
         boolean val=g.isconnected();
        if(val)
            System.out.print("Connected");
        else
        System.out.println("Disconneced");
        
        

    }
}