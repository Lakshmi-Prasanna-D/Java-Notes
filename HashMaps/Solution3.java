
import java.util.*;

/*3. Given array of n integers and frequency of each element in array using HashMap 
4. Given array of n integers and frequency of each element in array using HashMap according order of elements in array
5. Given integers n, find no of set bits using 3 techniques */
public class Solution3 {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    HashMap<Integer,Integer> hm=new HashMap<>();
    System.out.println("Enter n:");
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0 ; i<n; i++)
    {
         System.out.println("Enter "+(i+1) +" th number:");
         a[i]=sc.nextInt();
    }
    for(int i=0 ; i<n ;i++)
    {
      hm.put(a[i], hm.getOrDefault(a[i],0)+1);

    }
   
         
         Set<Integer> s1 = hm.keySet();
         for(Integer x:s1)
         {
            System.out.println(x + "--->" +hm.get(x));
         }

}

    
}
