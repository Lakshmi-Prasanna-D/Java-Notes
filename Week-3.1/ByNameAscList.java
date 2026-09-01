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

class SortByNameAscList implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.sname.compareTo(s2.sname);
    }
}

public class ByNameAscList {
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

        Collections.sort(al, new SortByNameAscList());
        System.out.println("\n--- Student Records After Sorting by NameList (Ascending) ---");
        for (Student s : al) System.out.println(s);
        sc.close();
    }
}