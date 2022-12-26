package lab10_prob3;

import java.util.Arrays;
import java.util.List;

public class Main {

    static <T extends Object> boolean contains1(List<T> list, T s) {
        for (T x : list) {
            if (x == null && s == null) return true;
            if (x == null || s == null) continue;
            if (x.equals(s)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bob", "Joe", "Tom");
        boolean result = contains1(list, "Tom");

        List<Integer> list2 = Arrays.asList(0, 1, 2, 3, 4);
        boolean result2 = contains1(list2, 0);

        System.out.println(result);
        System.out.println(result2);
    }
}
