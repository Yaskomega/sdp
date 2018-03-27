public class Product {
    private String name;
    private int shelflife; // in days
    private double price;

    public Product(String name, int shelflife, double price) {
        this.name = name;
        this.shelflife = shelflife;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShelflife() {
        return shelflife;
    }

    public void setShelflife(int shelflife) {
        this.shelflife = shelflife;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDecreasingAmountPerDay(){
        return this.price/this.shelflife;
    }
}
