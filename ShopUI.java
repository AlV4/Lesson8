import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


public class ShopUI {

    private BirdShopStore shop;
    private JLabel textName = new JLabel("Input your name: ");
    private JTextField textWindow = new JTextField();
    private JLabel nameProducts = new JLabel("Birds: ");
    private JLabel counter = new JLabel("Amount: ");
    private NumberFormat numberFormat = NumberFormat.getNumberInstance();
    private JFormattedTextField textFieldCounter = new JFormattedTextField(numberFormat);
    private JButton buy = new JButton("Buy");
     String currentProductName;


    public ShopUI(BirdShopStore shop) {
        this.shop = shop;
        JFrame f = new JFrame("My feeble attempts to learn Java");
        f.setMinimumSize(new Dimension(800, 600));
        f.setLocation(500, 150);

        f.getContentPane().add(createPanel());


        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }

    private JPanel createPanel() {

        JPanel panel = new JPanel(new GridBagLayout());

        textWindow.setColumns(20);
        panel.add(textName, new GridBagConstraints(0, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        panel.add(textWindow, new GridBagConstraints(1, 0, 1, 1, 0, 0, GridBagConstraints.LINE_START, 0, new Insets(0, 0, 0, 0), 0, 0));

        ButtonGroup productsGroup = new ButtonGroup();

        JPanel performProducts = new JPanel(new GridLayout(shop.getProducts().size(), 0));

        performProducts.setBorder(BorderFactory.createLineBorder(Color.lightGray, 3));
        for (final Product p : shop.getProducts()) {
            JRadioButton radioButton = new JRadioButton(p.getName() + " " + p.getSalePrice());
            productsGroup.add(radioButton);
            performProducts.add(radioButton);
            radioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   currentProductName = p.getName();
                }
            });
        }

        panel.add(nameProducts, new GridBagConstraints(0, 1, 1, 1, 0, 0, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));
        panel.add(performProducts, new GridBagConstraints(1, 1, GridBagConstraints.REMAINDER, 1, 0, 0, GridBagConstraints.LINE_START,
                GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));

        panel.add(counter, new GridBagConstraints(0, 2, 1, 1, 0, 0, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));
        textFieldCounter.setColumns(2);
        textFieldCounter.setValue(1);
        panel.add(textFieldCounter, new GridBagConstraints(1, 2, 1, 1, 0, 0, GridBagConstraints.WEST, 0, new Insets(0, 0, 0, 0), 0, 0));

        panel.add(buy, new GridBagConstraints(1, 3, 1, 1, 0, 0, GridBagConstraints.CENTER, 0, new Insets(0, 0, 0, 0), 0, 0));

        buy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Costumer c = new Costumer(textWindow.getText());
                shop.buyItem(c,currentProductName,Integer.parseInt(textFieldCounter.getText()));
            }
        });

        return panel;
    }
}
