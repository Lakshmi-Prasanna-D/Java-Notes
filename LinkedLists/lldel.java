import java.util.LinkedList;
import java.util.Scanner;

public class lldel {
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
        list.removeFirst();
        System.out.println("Elements in the linked list after deletion of first element are: " + list);
          for(int i= 0; i < list.size(); i++) 
            System.out.print( list.get(i) +" ");
            
          System.out.println();
          list.removeLast();
        System.out.println("Elements in the linked list after deletion of last element are: " );
          for(int i= 0; i < list.size(); i++) {
            System.out.print( list.get(i) +" ");
    }
}
}