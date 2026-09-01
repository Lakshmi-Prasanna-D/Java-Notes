import java.util.Scanner;

public class trailingzeros {

    static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    static int findZeros(int n) {
        long ans = fact(n);
        int c = 0;
        while (ans % 10 == 0) {
            c++;
            ans /= 10;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Trailing zeros: " + findZeros(n));
        sc.close();
    }
}
