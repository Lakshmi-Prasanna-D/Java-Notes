package StreamsConcepts;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
public class StreamExample1 {
    public static void main(String args[]){
    List<String> fruits=Arrays.asList("Apple" ,"Banana", "Grapes");
    Stream<String> st=fruits.stream();
    st.forEach(System.out::println);
}
}
