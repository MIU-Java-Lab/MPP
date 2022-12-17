import java.util.function.Function;

public class FreeVariables {
    static double regularVariable = 10.23;


    public static void main(String[] args) {

        double freeVariable = 10.23;

        Function<Integer, Boolean> lambda = (x) -> {
            regularVariable += 1;
            // freeVariable += 1; --- not possible to change value of freeVariable
            System.out.println("regularVariable: " + regularVariable);
            System.out.println("freeVariable: " + freeVariable);
            return x > 0;
        };
        lambda.apply(1);
    }
}
