import java.util.*;


class DSU{
    int n;
    int parent[];
    int components;
   // HashMap<Integer,ArrayList<Integer>> res=new HashMap<>();
public DSU(int n){
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
class DSUcode{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        DSU o=new DSU(n);
        while(true){
            System.out.println("1.add friendship \n 2.check friendship \n 3.how many groups \n 4.persons in each group");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("enter source node and destination nodes :");
                    int u=sc.nextInt();
                    int v=sc.nextInt();
                     o.union(u,v);
                     break;
            case 2:
                System.out.println("enter source and destinantion nodes:");
                    u=sc.nextInt();
                    v=sc.nextInt();
                  o.findrelation(u,v);
                  break;
            case 3:
                System.out.println("no of groups are:");
                System.out.println(o.getcomponent());
                break;
            case 4:
                System.out.println("elements group wise are:");
                o.printgroups(); break;
            case 5:


            


            }
        }

    }
    
}