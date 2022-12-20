package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob3 {
    public static int countWords(List<String> words, char c, char d, int len) {
        String cc = String.valueOf(c);
        String dd = String.valueOf(d);

        return (int) words.stream()
                .filter(x -> x.contains(cc))
                .filter(x -> !x.contains(dd))
                .filter(x -> x.length() == len)
                .count();
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ismoil", "Shokirov", "Fayzulla", "Abdurakhimov", "Isroil");
        System.out.println(countWords(list, 'l', 'a', 6));
    }
}
