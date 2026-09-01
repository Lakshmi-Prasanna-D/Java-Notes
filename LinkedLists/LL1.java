
import java.util.*;
public class LL1
 {
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println("Enter the no of values to be added to the linked list");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println("Elements in the linked list are: " + list);

        for(int i= 0; i < list.size(); i++) {
            System.out.print( list.get(i) +" ");
        }
        scanner.close();
    }
    }