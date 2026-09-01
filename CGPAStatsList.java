import java.util.*;

class Student {
    int rollno, total;
    String sname, branch;
    double cgpa;

    public Student(int rno, String name, String br, int tot, double gpa) {
        rollno = rno;
        sname = name;
        branch = br;
        total = tot;
        cgpa = gpa;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + sname + ", Branch: " + branch +
               ", Total: " + total + ", CGPA: " + cgpa;
    }
}

public class CGPAStatsList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        ArrayList<Student> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rno = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Branch: ");
            String branch = sc.next();
            System.out.print("Total Marks: ");
            int total = sc.nextInt();
            System.out.print("CGPA: ");
            double gpa = sc.nextDouble();
            al.add(new Student(rno, name, branch, total, gpa));
        }

        double maxCgpa = al.get(0).cgpa;
        double minCgpa = al.get(0).cgpa;

        for (Student s : al) {
            if (s.cgpa > maxCgpa) maxCgpa = s.cgpa;
            if (s.cgpa < minCgpa) minCgpa = s.cgpa;
        }

        System.out.println("\n--- Student(s) with Highest CGPA ---");
        for (Student s : al) {
            if (s.cgpa == maxCgpa) System.out.println(s);
        }

        System.out.println("\n--- Student(s) with Lowest CGPA ---");
        for (Student s : al) {
            if (s.cgpa == minCgpa) System.out.println(s);
        }

        sc.close();
    }
}