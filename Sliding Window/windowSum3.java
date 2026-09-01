import java.util.Scanner;

public class windowSum3 {
    public static int[] findWindowSum(int a[],int n,int k)
    {
        int res[]=new int[n-k+1];

        for(int i=0;i<=n-k;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
               sum+=a[j];
            }
            res[i]=sum
;                
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
         a[i]=sc.nextInt();
        }
        int b[]=new int [n-k+1];
       b= findWindowSum(a,n,k);
       for(int x:b)
         System.out.print(x+" ");
    }
}
