import java.util.function.Function;
@FunctionalInterface
interface Converter {
    double milesToKm(double distance);
}

public class FuncInterFaceExamples {
    public static void main(String[] args) {
        // we don't have to specify type for lambda function parameters
        // Converter cv = (double d) -> 1.609 * d;
        Converter cv = (d) -> 1.609 * d;
        System.out.println("Miles: " + cv.milesToKm(5));

        Function<Integer, Boolean> lambda = (x) -> x % 2 != 0;
        System.out.println(lambda.apply(3));
    }
}
