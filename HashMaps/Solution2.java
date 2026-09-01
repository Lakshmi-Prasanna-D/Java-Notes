import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution2 {
    public static void main(String args[])
    {
        HashMap<String, Double> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter no.of students");
        int n = sc.nextInt();
         
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter student-" + (i + 1) + " RollNo:");
            String s = sc.next();
            System.out.println("Enter CGPA:");
            double mar = sc.nextDouble();
            hm.put(s, mar);
        }

        System.out.println("\nStudent CGPAs:");
        for (Map.Entry<String, Double> e1 : hm.entrySet())
        {
            String x = e1.getKey();
            Double val = e1.getValue();
            System.out.println(x + " ---> " + val);
        }

        sc.close();
    }
}
