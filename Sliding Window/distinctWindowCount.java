 import java.util.*;
public class distinctWindowCount {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      int k=sc.nextInt();
     int r[]=distinctWindow(a,n,k);
    for(int x:r)
    {
        System.out.print(x+" ");
    }
    } 
        static int[] distinctWindow(int a[],int n,int k)
        {
            int res[]=new int[n-k+1];
            for(int i=0;i<n;i++)
            {
                HashSet<Integer> hs=new HashSet<>();

                for(int j=i;j<i+k;j++){
                    hs.add(a[j]);
                }
                res[i]=hs.size();
            }
            return res;
        }
  }

