
import java.util.*;
class Solution1
{
    public static void main(String args[])
    {
         HashMap<String,Double> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
       
         System.out.println("Enter no.of students");
         int n=sc.nextInt();
         
         for(int i=0 ; i<n ; i++)
         {
           System.out.println("Enter student-1 RollNo");
           String s=sc.next();
           System.out.println("Enter CGPA:");
           double mar=sc.nextDouble();
         hm.put(s,mar);
         }
         Set<String> s1 = hm.keySet();
         for(String x:s1)
         {
            System.out.println(x + "--->" +hm.get(x));
         }
    }
}