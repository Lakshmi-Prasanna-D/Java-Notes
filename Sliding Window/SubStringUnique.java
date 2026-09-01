import java.util.*;


public class SubStringUnique {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=findCount(s);
        System.out.println("count of substrings"+n);


    }
    static int findCount(String s){
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Character> hs=new HashSet<>();
            for(int j=i;j<n;j++)
            {
              hs.add(s.charAt(i));
              if(hs.size()==j-i+1)
                   c++;
            }

        }
        return c;
    }
}
