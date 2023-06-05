package Seminar1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private final List<Product> goods = new ArrayList<>();
    private double cash = 0;

    public VendingMachine addProduct(Product prod) {
        goods.add(prod);
        return this;
    }

    public List<Product> getGoods() {
        return goods;
    }

    public Product findProduct(String name) {
        for (Product prd : goods) {
            if (name.equals(prd.getProductName())) {
                return prd;
            }
        }
        return null;
    }

    public double getCash() {
        return cash;
    }

    public Product saleProduct(String name) {
        Product founded = findProduct(name);
        if (founded != null) {
            cash = cash + founded.getPrice();
            goods.remove(founded);
        }
        return founded;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cash: ")
                .append(cash)
                .append('\n');
        for (Product prd : goods) {
            builder.append(prd).append('\n');
        }
        return builder.toString();
    }
}