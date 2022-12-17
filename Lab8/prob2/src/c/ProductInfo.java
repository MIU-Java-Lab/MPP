package c;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductInfo {

    static enum SortMethod {BYNAME, BYSALARY}

    public static void sort(List<Product> prods, SortMethod method) {

        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                if (method == SortMethod.BYNAME) {
                    return p1.title.compareTo(p2.title);
                } else if (method == SortMethod.BYSALARY) {
                    return Double.compare(p1.price, p2.price);
                }
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Orange", 1.1, 1));
        products.add(new Product("Apple", 5.201, 2));
        products.add(new Product("Banana", 5.2, 3));
        products.add(new Product("Blueberry", 3.1, 4));

        sort(products, SortMethod.BYNAME);
        System.out.println(products);

        sort(products, SortMethod.BYSALARY);
        System.out.println(products);
    }
}
