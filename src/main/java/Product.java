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
    public void updatePrice(int days){
        double amount = this.getDecreasingAmountPerDay();
        this.price -= amount*days;
        if(this.price<0)
            this.price=0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", shelflife=" + shelflife +
                ", price=" + price +
                '}';
    }
}
