import java.util.Date;

public class Transaction {
    private Costumer costumer;
    private Product product;
    private int amount;
    private double sum;
    private Date dateOfTransaction;

    public Transaction() {
    }

    public Transaction(Costumer costumer, Product product, int amount, double sum, Date dateOfTransaction) {
        this.costumer = costumer;
        this.product = product;
        this.amount = amount;
        this.sum = sum;
        this.dateOfTransaction = dateOfTransaction;
    }

    public Costumer getCostumer() {
        return costumer;
    }

    public void setCostumer(Costumer costumer) {
        this.costumer = costumer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }
}
