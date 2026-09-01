import java.util.LinkedList;
import java.util.Scanner;

public class LLsearch {
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
        System.out.println("Enter the element to search");
        int ele = scanner.nextInt();
        if(list.contains(ele))
        {
            System.out.println("Element " + ele + " found at index: " + list.indexOf(ele));
        }
        else
        {
            System.out.println("Element " + ele + " not found in the linked list.");
        }
}
}
