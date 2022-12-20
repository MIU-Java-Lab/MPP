package prob2;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class prob2 {
    public static void main(String[] args) {
        IntSummaryStatistics myIntStream = Stream.of(-99, 2, 2, 4, 0)
                .collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(myIntStream.getMax());
        System.out.println(myIntStream.getMin());
    }
}
