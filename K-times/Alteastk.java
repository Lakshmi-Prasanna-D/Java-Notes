import java.util.*;
class Atleastk
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in) ;
     HashMap<Integer,Integer> hm=new HashMap<>();
     ArrayList<Integer> al=new ArrayList<>();
     System.out.println("Enter size of array:");
     int n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter "+n+" values");
     for(int i=0; i<n ;i++)
     {
        a[i]=sc.nextInt();

     }
     System.out.println("Enter k value ");
     int k=sc.nextInt();
    for(int i=0 ;i<n ;i++)
    {
       hm.put(a[i],hm.getOrDefault(a[i],0)+1);

    }
    Set<Integer> s1=hm.keySet();
    for(int x:s1)
    {
        int val=hm.get(x);
        if(val>=k)
        al.add(x);
    }
     if(al.isEmpty()){
        System.out.println("zero");
       
     }
     else{
  System.out.println("The values with frequency >="+k+" are:");
 
  for(int v:al)
  {
    System.out.println(v + " ");
  }}
    }
}