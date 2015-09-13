import java.util.ArrayList;

public class Reports {
    public BirdShopStore store;

    public Reports(BirdShopStore store) {
        this.store = store;
    }

    private ArrayList<Product> getData() {
        return store.getProducts();
    }

    public void pricesReport() {
        System.out.println("Today buy prices:");
        for (Product p : getData()) {
            System.out.println(p.getName() + ": " + p.getBuyPrice() + "$");
        }
        System.out.println("\nToday sale prices:");
        for (Product p : getData()) {
            System.out.println(p.getName() + ": " + p.getSalePrice() + "$");
        }
        System.out.println();
    }

    public void daySaldo() {

        double money = 0;
        for (Product p : getData()) {
            money += (p.getCapacity() - p.getAmount()) * (p.getSalePrice() - p.getBuyPrice());
        }
        System.out.println("Amount without offering a new birds: " + money + "$.");
        System.out.println();
    }

    public void remainItems() {
        System.out.println("Birds left:");
        String end;
        String endNoS = "item.";
        String endS = "items.";
        for (Product p : getData()) {
            if (p.getAmount() == 1) {
                end = endNoS;
            } else {
                end = endS;
            }
            System.out.println(p.getName() + ": " + p.getAmount() + " " + end);
        }
        System.out.println();
    }

    public void lessThanThreeCheck() {
        for (Product p : getData()) {
            if (p.getAmount() < 3) {
                System.out.println("There is " + p.getAmount() + " "
                        + p.getName() + " left! ");
            }
        }
        System.out.println();
    }
    public void profitReport() {
        long money = 0;
        for (Product p : getData()) {

            money += (p.getCapacity() - p.getAmount())
                    * p.getSalePrice();
        }
        System.out.println("Today we sold all birds for " + money + "$.");
        System.out.println();
    }
    public void tomorrowOrder(){
        System.out.println("Tomorrow order:");
        int sum = 0;
        int result = 0;
        for (Product p:getData()) {
            result =  p.getCapacity() - p.getAmount();
            if(result > 0){
                System.out.print(p.getName() + ": " + result);
                System.out.println(", need "+ p.getBuyPrice()* result+"$");
                sum += p.getBuyPrice() * result;
            }
        }
        System.out.println("Total order: "+ sum + "$.");
        System.out.println();
    }
}
