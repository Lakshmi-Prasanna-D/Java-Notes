import java.util.*;
public class LongestSubArray {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size:");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter"+n+" elements :");
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();   
        System.out.println("Enter target:");
        int target=sc.nextInt();

        int f=-1,l=-1;
        int res=0;
        int len=0;

        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s+=a[j];
                if(s==target){
                   len=j-i+1;
                    if(len>res){
                         res=len;
                         f=i-1;
                         l=j+1;
                    }
                }
                
            }
        }
        if(len!=0){
        for(int i=f;i<=l;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
  }

}
