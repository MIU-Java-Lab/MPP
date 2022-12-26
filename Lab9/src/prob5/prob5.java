package prob5;

import java.util.Arrays;
import java.util.stream.Stream;

public class prob5 {

    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }

    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream.skip(m).limit(n);
    }

    public static void main(String[] args) {
        Stream<String> strings = streamSection(nextStream(), 4, 4);
        strings.forEach(System.out::println);
    }
}
