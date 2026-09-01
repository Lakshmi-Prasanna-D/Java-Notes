import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LL3 {
      public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the no of values to be added to the linked list");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Elements in the linked list are: ");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        scanner.close();
    }
}
