package prob6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class prob6 {
    public static Set<String> union(List<Set<String>> sets)
    {
        Set<String> lastSet = sets.stream().reduce(new HashSet<>(), (a, b) -> {
            Set<String> set = new HashSet(a);
            set.addAll(b);
            return set;
        });

        return lastSet;
    }

    public static void main(String[] args) {
        List<Set<String>> setList = Arrays.asList(
                new HashSet<>(Arrays.asList("A", "B")),
                new HashSet<>(Arrays.asList("D")),
                new HashSet<>(Arrays.asList("1", "3", "5"))
        );

        System.out.println(setList);
        System.out.print(union(setList));
    }
}
