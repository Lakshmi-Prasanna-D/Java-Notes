import java.util.Scanner;

public class PrimeCountCheck {
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        int c = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
                if (n / i != i) {
                    c++;
                }
            }
        }

        return c == 2;
    }

    static void findPrimes(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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
