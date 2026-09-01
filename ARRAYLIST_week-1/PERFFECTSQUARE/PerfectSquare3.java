import java.util.*;
class squareroot {
    public boolean isPerfectSquare(int n) {
       long x=(long)Math.sqrt(n);
       if(x*x==n)
        return true;
    return false;
    }
}

public class PerfectSquare3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

       squareroot o1 = new squareroot();
        if (o1.isPerfectSquare(n)) {
            System.out.println(n + " is a perfect square.");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
    }
}

