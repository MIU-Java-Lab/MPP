package prob4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob4 {
    public static void printSquares(int num) {

        IntStream.iterate(1, n -> n + 1)
                .map(n -> n * n)
                .limit(num)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSquares(4);
    }
}
