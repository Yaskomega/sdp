import org.junit.*;
import org.junit.Assert;

public class TestProduct {

    @Test
    public void createProduct() {
        Product p = new Product("Milk", 5, 2.51);
        Assert.assertTrue(p != null);
    }
}