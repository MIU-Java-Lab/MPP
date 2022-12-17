import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> lStream = list.stream()
                .filter(s -> s > 1)
                .collect(Collectors.toList());
        System.out.println(lStream);


        // Streams Iterate
        Stream<Integer> stream = Stream.iterate(1, n -> n + 2)
                .limit(8)
                .skip(4);
        stream.forEach(System.out::println);

        // Imperative style - focus on how to do
        char[] charArr = {'a', 'p', 'p', 'l', 'e'};
        String str = new String(charArr);
        System.out.println(str);

        // Declarative style - focus on what to do
        // Function<char[], String> lambda = arr -> new String(arr); -- arrow func way
        Function<char[], String> lambda = String::new; // method reference
        System.out.println(lambda.apply(charArr));


        // Map vs FlatMap
        List<Integer> flatList = Stream.of(1, 2, 3, 4)
                .flatMap(n -> Stream.of(n, n * n))
                .collect(Collectors.toList());
        System.out.println(flatList);


        // Stream Reduce
        Stream<String> strings = Stream.of(null);
        System.out.println(strings.reduce((a, b) -> a + " " + b).get());

    }
}
