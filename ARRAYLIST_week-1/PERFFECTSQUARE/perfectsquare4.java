import java.util.Scanner;
class binarysearch
{
    public boolean isPerfectSquare(int n)
    {
        int m;
        int l=1,r=n;
        while(l<=r)
        {
             m=(l+r)/2;
            if(m*m==n)
              return true;
            else if(m*m < n)
              l=m+1;
            else
               r=m-1;

        }
        return false;
    }
}
public class perfectsquare4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

       binarysearch o1 = new   binarysearch ();
        if (o1.isPerfectSquare(n)) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}
