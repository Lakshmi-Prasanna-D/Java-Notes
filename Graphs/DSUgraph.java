import java.util.Scanner;
class Graph{
    int n;
    int parent[];
    int components;
   // HashMap<Integer,ArrayList<Integer>> res=new HashMap<>();
public Graph(int n){
    this.n=n;
    parent=new int[n];
    for(int i=0;i<n;i++){
        parent[i]=i;
        components=n;
       // hm.put(i,Arrays.asList(i));
    }
}
int find(int i){
    if(parent[i]==i) 
         return i;
    return find(parent[i]);
    }
void union(int i,int j){
    int i1=find(i);
    int j1=find(j);
    if(i1!=j1){
        parent[i1]=j1;
         components--;
}
}
void findrelation(int u,int v){
    int i=find(u);
    int j=find(v);
    if(i==j)
          System.out.println("Relation exists");
    else
        System.out.println("No relation exists");
}

int getcomponent(){
    return components;
}
void printgroups(){
    HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
    for(int i=0;i<n;i++){
        int p=find(i);
        if(!hm.containsKey(p)){
            hm.put(p,new ArrayList<>());
        }
        hm.get(p).add(i);
    }
    System.out.println(hm);
}
}
public class DSUgraph {
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
                g.union(u,v);
            }
            max--;
        }
        g.printgroups();
        //System.out.println("Enter the start index:");
        //int s=sc.nextInt();
        g.findrelation(1,4);
        
        
        

    }
}
