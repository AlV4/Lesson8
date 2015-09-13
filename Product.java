
public class Product {
    private String name;
    private int amount;
    private double buyPrice;
    private double salePrice;
    private int capacity;

    public Product() {
    }
    public Product(String name) {
    }

    public Product(String name, int capacity, double buyPrice, double salePrice) {
        setName(name);
        setCapacity(capacity);
        setBuyPrice(buyPrice);
        setSalePrice(salePrice);
        setAmount(capacity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
