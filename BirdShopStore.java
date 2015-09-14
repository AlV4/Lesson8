import javax.xml.crypto.Data;
import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class BirdShopStore {
    private Costumer costumer;
    private Product product;
    private Transaction transaction;

    private ArrayList<Costumer> costumers = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BirdShopStore() {
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

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    public void setCostumers(ArrayList<Costumer> costumers) {
        this.costumers = costumers;
    }

    public ArrayList<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void initializationData() {

        Product duck = new Product("Duck", 10, 3, 5);
        products.add(duck);
        Product eagle = new Product("Eagle", 10, 7, 10);
        products.add(eagle);
        Product owl = new Product("Owl", 10, 4, 7);
        products.add(owl);
        Product chicken = new Product("Chicken", 10, 2, 4);
        products.add(chicken);
        Product parrot = new Product("Parrot", 10, 5, 9);
        products.add(parrot);
        Product turkey = new Product("Turkey", 10, 4, 8);
        products.add(turkey);
        printAllStack();
    }

    public void printAllStack() {
        for (Product p : products) {
            System.out.println("Product: " + p.getName() + ", amount: " + p.getAmount() + ", buy price: "
                    + p.getBuyPrice() + ", sale price: " + p.getSalePrice());
        }
        System.out.println();
    }

    public void buyItem(Costumer c, String name, int amount) {
        if (name != null && amount > 0) {
            for (Product p : products) {
                if (name == p.getName()) {
                    if (amount > p.getAmount()) {
                        System.out.println("Not enough " + p.getName().toLowerCase() + "s!\n");
                        break;
                    }
                    p.setAmount(p.getAmount() - amount);
                    Transaction transaction = new Transaction(c,p,amount,amount*p.getSalePrice(),new Date());
                    transactions.add(transaction);
                    String end = "s.";
                    if(amount==1){
                        end = ".";
                    }
                    System.out.println("Costumer " + c.getName() + " bought " + amount + " " + p.getName().toLowerCase() +
                            end);
                    System.out.println(transaction.getDateOfTransaction()+"\nOperation complete!\n");

                    break;

                }
            }

        } else {
            System.out.println("Incorrect amount!\n");
        }
    }
}
