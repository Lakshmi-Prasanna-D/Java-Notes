import java.util.Scanner;

public class InversionCount2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
              a[i]=sc.nextInt();
       int c=MergeSort(a,0,n-1);
       
         System.out.print(c);
    }
    public static int MergeSort(int a[],int l,int r)
    {
        int res=0;
        if(l<r)
        {
            int m=(l+r)/2;
           res=res+ MergeSort(a,l,m);
            res+=MergeSort(a,m+1,r);
            res+=Merge(a,l,m,r);
        }
        return res;
    }
    public static int Merge(int a[],int l,int m,int r)
    {
        int res=0;
        int n1=m-l+1;
        int n2=r-m;
        int L1[]=new int[n1];
        int R1[]=new int[n2];
        for(int i=0;i<n1;i++)
              L1[i]=a[l+i];
        for(int i=0;i<n2;i++){
            R1[i]=a[m+1+i];
        }
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(L1[i]<=R1[j]){
             a[k++]=L1[i++];
             
            }
            else
             {
                res += (n1 - i);
                 a[k++]=R1[j++];
             }
            
        }
        while(i<n1)
            a[k++]=L1[i++];
        while(j<n2)
            a[k++]=R1[j++];
    return res;
}
}