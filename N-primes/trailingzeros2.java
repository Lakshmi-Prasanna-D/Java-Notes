import java.util.Scanner;

public class trailingzeros2 { 

    static int findZeros(int n) {
        int c = 0;
        if (n < 5) return 0;

        for (int i = 5; n / i >= 1; i *= 5) {
            c += n / i;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Trailing zeros (efficient): " + findZeros(n));
        sc.close();
    }
}
