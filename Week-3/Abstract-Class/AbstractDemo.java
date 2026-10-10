abstract class A{
    abstract void show();
}
class B extends A{
    public void show(){
   System.out.println("In show method");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}
