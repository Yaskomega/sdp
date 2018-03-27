public class Product {
    private String name;
    private int shelflife; // in days
    private double prive;

    public Product(String name, int shelflife, double prive) {
        this.name = name;
        this.shelflife = shelflife;
        this.prive = prive;
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

    public double getPrive() {
        return prive;
    }

    public void setPrive(double prive) {
        this.prive = prive;
    }
}
