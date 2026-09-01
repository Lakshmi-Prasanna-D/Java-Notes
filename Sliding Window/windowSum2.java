import java.util.Scanner;

public class windowSum2 {
    public static int[] findWindowSum(int a[],int n,int k)
    {
        int res[]=new int[n-k+1];
        int sum=0;
        for(int i=0;i<k;i++)
           sum+=a[i];
           res[0]=sum;
        for(int i=1;i<=n-k;i++)
        {
            sum+=a[i+k-1];
            sum-=a[i-1];
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
