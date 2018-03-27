import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args)
    {
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Milk", 5, 2.51));
        products.add(new Product("Cheese", 3*7, 2.71));
        products.add(new Product("Strawberry", 2, 10.00));
        products.add(new Product("Melons", 4, 4.04));
        products.add(new Product("Peppers", 7, 3.60));
        products.add(new Product("Carotts", 3*30, 2.01));
        products.add(new Product("Onions", 3*7, 1.92));
        products.add(new Product("Rice", 365, 5.60));
        Shop s = new Shop(products);
    }
}
