
public class Launcher {
    public static void main(String[] args) throws Exception {
    BirdShopStore shop = new BirdShopStore();

        shop.initializationData();
        new ShopUI(shop);
//        shop.buyItem("Duck", 3);
//        shop.buyItem("Duck", 3);
//        shop.buyItem("Owl",25);
//        shop.buyItem("Owl",5);
//        shop.buyItem("Duck", 3);
//        shop.buyItem("Eagle", 3);
//        shop.buyItem("Turkey", 8);
//        Reports report = new Reports(shop);
//        report.pricesReport();
//        report.daySaldo();
//        report.remainItems();
//        report.lessThanThreeCheck();
//        report.profitReport();
//        report.tomorrowOrder();
//
//        shop.printAllStack();
    }
}
