public Package PRIMES;
public class Prime1 {
    static boolean isPrime(int x) {
        if (x <= 1) return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0)
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

  