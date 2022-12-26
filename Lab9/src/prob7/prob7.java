package prob7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface TriFunction<S, T, U, R> {
    R apply(S s, T t, U u);
}

class LambdaLibrary {
    public static final TriFunction<List<Employee>, String, Integer, List<String>>
            SEARCH_BY_LASTNAME_AND_SALARY = (list, search, salary) -> list.stream()
            .filter(a -> a.salary > salary)
            .filter(a -> a.lastName.startsWith(search))
            .map(a -> a.firstName + " " + a.lastName)
            .sorted()
            .collect(Collectors.toList());
}

public class prob7 {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000)
        );
        List<String> letters = IntStream.rangeClosed('N', 'Z').mapToObj(var -> "" + (char) var).collect(Collectors.toList());
        for (String s : letters) {
            list.stream().filter(a -> a.salary > 100000)
                    .filter(a -> a.lastName.startsWith(s))
                    .map(a -> a.firstName + " " + a.lastName)
                    .sorted()
                    .collect(Collectors.toList()).forEach(System.out::println);
        }
        System.out.println("---------------");
        for (String s : letters) {
            LambdaLibrary.SEARCH_BY_LASTNAME_AND_SALARY.apply(list, s, 100000)
                    .forEach(System.out::println);
            ;
        }
    }
}
