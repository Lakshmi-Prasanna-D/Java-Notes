import java.util.Scanner;

public class PrimeSixKCheck {
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        if (x <= 3) return true;
        if (x % 2 == 0 || x % 3 == 0) return false;

        for (int i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0)
                return false;
        }
        return true;
    }

    static void findPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        findPrimes(n);
        sc.close();
    }
}