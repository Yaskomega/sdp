import org.junit.*;
import org.junit.Assert;

public class TestProduct {

    @Test
    public void createProduct() {
        Product p = new Product("Milk", 5, 2.51);
        Assert.assertTrue(p != null);
    }

    @Test
    public void getDecreasingAmountPerDay() {
        Product p = new Product("Kitkat", 10, 30);
        double amount = p.getDecreasingAmountPerDay();
        Assert.assertEquals("Decreasing amount must be 3",3.0, amount, 0);
    }

    @Test
    public void updatePrice() {
        Product p = new Product("Kitkat", 10, 30);
        p.updatePrice(2);
        Assert.assertEquals("Price must be 24",24.0, p.getPrice(), 0);
    }
}