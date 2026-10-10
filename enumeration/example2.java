package enumeration;
enum Laptop{
    HP(70000), Lenovo(55000),Asus(57000);
   private int price ;
    private Laptop(int price) {
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    
}
public class example2 {
    public static void main(String args[]){
    Laptop lap= Laptop.HP;
    System.out.println(lap+" "+lap.getPrice());
    for(Laptop l:Laptop.values()){
       System.out.println(l);
    }
}
}
