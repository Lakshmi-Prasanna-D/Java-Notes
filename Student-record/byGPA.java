
import java.util.*;
class Student{
    int rollno,total;
    String sname,branch;
    double cgpa;
    public Student(int rno,String name,String br,int tot,double gpa)
    {
        rollno=rno;
        sname=name;
        branch=br;
        total=tot;
        cgpa=gpa;

    }
     @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + sname + ", Branch: " + branch +
               ", Total: " + total + ", CGPA: " + cgpa;
    }
}
class SortBycgpa implements Comparator<Student>
{
      @Override
    public int compare(Student s1, Student s2)
    {
        if(s1.cgpa==s2.cgpa)
          return 0;
        else if(s1.cgpa>s2.cgpa)
          return 1;
        else return -1;
    }
}
public class byGPA
{
    public static void main(String args[])
    {
        // @Override
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        ArrayList<Student>al=new ArrayList<>();
        //Student s1=new Student();
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

            Student s1 = new Student(rno, name, branch, total, gpa);
            al.add(s1);
        } 
         for(Student s:al)
         {
            System.out.println(s);
         }
         
         Collections.sort(al, new SortBycgpa());
          System.out.println("--- Student Records After Sorting by total ---");
         for(Student s:al)
         {
            System.out.println(s);
         }
         sc.close();
    }
}
