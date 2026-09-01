
import java.util.*;

public class arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer> l=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8,9,9,15));
      ArrayList<Integer> ls=new ArrayList<>(Arrays.asList(10,11));      
      //int n; 
        l.remove(8);
      
        for(int x:l)
           System.out.print(x+"  ");
        System.out.println(l.get(9));
        System.out.println(l.size());
        l.addAll(ls);
        for(int x:l)
         System.out.print(x+"  ");
       // l.removeRange(3,7);
        //l.removeIf(n-->(n%2==0));
        l.contains(3);
        System.out.println(l.indexOf(4));
        System.out.println(l.isEmpty());
        l.lastIndexOf(2);
        l.clear();
        for(int x:l)
         System.out.println(x);


    }
}
