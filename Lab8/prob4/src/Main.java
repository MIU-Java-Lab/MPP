import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        fruits.forEach(fruit -> System.out.println(fruit));
        fruits.forEach(System.out::println);
    }
}