package ab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
		List<Product> products = new ArrayList<>();

		products.add(new Product("Orange", 1.1, 1));
		products.add(new Product("Apple", 5.201, 2));
		products.add(new Product("Banana", 5.2, 3));
		products.add(new Product("Blueberry", 3.1, 4));

		Collections.sort(products, new ProductPriceComparator());
		System.out.println(products);

		Collections.sort(products, new ProductTitleComparator());
		System.out.println(products);
	}
}
