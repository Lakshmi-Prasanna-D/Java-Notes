import java.util.*;
public class Inversion_Count1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       int c= FindInversionCount(a,n);
        
        System.out.println(c);
    }
    public static int FindInversionCount(int[]a,int n) {


        int c=0;
        for(int i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
              if(a[i]>a[j])
                 c++;
        }
        return c;
    }
}
