package d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductInfo
{
    static enum SortMethod {BYPRICE, BYTITLE};
    private static SortMethod sortMethod = SortMethod.BYPRICE;

    public static void sort(List<Product> prod, final SortMethod method)
    {
        Collections.sort(prod, (p1,p2) ->
        {
            if(method == sortMethod)
            {
                return Double.compare(p1.getPrice(), p2.getPrice());
            }
            else
            {
                throw new IllegalArgumentException("Cannot compare");
            }
        });
    }

    public static void main(String[] args)
    {
        List<Product> products = new ArrayList<>();

        products.add(new Product("B", 2000.0, 1));
        products.add(new Product("A", 1000.0, 2));
        products.add(new Product("C", 500.0, 3));
        products.add(new Product("D", 3000.0, 4));

        sort(products, SortMethod.BYPRICE);
        System.out.println(products);


    }
}