package lab10_prob2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Double> doubles = Arrays.asList(2.2, 1.2, 2.3, 4.5);
        List<Integer> ints = Arrays.asList(1, 3, 4, 5, 2);
        List<Float> floats = Arrays.asList(10.2f, 100.0f, 51.9f, 20.001f);

        System.out.println(SecondSmallest(doubles));
        System.out.println(SecondSmallest(ints));
        System.out.println(SecondSmallest(floats));
    }

    public static <T extends Comparable<T>> T SecondSmallest(List<T> list)
    {
        T temp;
        for (int i = 0; i < 2; i++)
        {
            for (int j = i + 1; j < list.size(); j++)
            {
                if (list.get(i).compareTo(list.get(j)) > 0)
                {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }

        return list.get(1);
    }
}