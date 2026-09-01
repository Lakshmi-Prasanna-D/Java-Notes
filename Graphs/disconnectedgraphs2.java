//java program to print the Depth first search on a disconnected graph without a start index

import java.util.*;

public class disconnectedgraphs2 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    

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
     void dfs(int s,boolean visited[],List<Integer> res){
        res.add(s);
        visited[s]=true;
        for(int i=0;i<n;i++){
            if(mat[s][i]==1 && !visited[i]){
                visited[i]=true;
                dfs(i,visited,res);
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