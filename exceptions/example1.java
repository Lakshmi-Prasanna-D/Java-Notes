package exceptions;

public class example1  {
    public static void main(String args[])throws Exception{
        int x=0;
        int y=10;
        int res=0;
        String s=null;
         System.out.println("the string's length is:"+ s.length());
        try{
         System.out.println(2.6/10);
        }
        catch(Exception e){
         e.printStackTrace();
        }
        System.out.println(res);
    }
}
