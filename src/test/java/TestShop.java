import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class TestShop {

    @Test
    public void createShop() {
        Product p = new Product("Milk", 5, 2.51);
        List<Product> products = new ArrayList<Product>();
        products.add(p);
        Shop s = new Shop(products);
        Assert.assertTrue(s != null);
    }
}
