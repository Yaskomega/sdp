import org.junit.*;

public class TestProduct {

    @Test
    public void createProduct() {
        Product p = new Product("Milk", 5, 2.51);
        assert p != null;
    }
}