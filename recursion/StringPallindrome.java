
import java.util.*;
public class StringPallindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(palindrome(s, 0 , s.length()-1))
              System.out.println("Given String "+ s+ " is a palindrome");
        else
              System.out.println("Given String "+ s+ " is not a palindrome");

    }
    static boolean palindrome(String s , int i ,int n){
        if(i>=n/2) return  true;
        if(s.charAt(i)==s.charAt(n-i))
             return palindrome(s, i+1,n);
        else return  false;
    }
}
