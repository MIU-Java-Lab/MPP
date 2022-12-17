import java.util.function.Function;

public class LambdaMethodReference {
    public static void main(String[] args) {
        Function<String, String> shortLambda = String::toUpperCase;
        String res = shortLambda.apply("ismoil");
        System.out.println(res);
    }
}
