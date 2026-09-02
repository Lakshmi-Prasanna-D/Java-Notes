package enumeration;

public class example1 {
    public static void main(String args[]){
    enum day{
        Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday;
    }
    day today=day.Monday;
    System.out.println(day.Tuesday);
    for(day d: day.values())
         System.out.println(d);

}
}