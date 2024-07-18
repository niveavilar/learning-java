package cartao;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double balance;
    private List<TransactionPin> purchases;

    public CreditCard(double limit) {
        this.limit = limit;
        this.balance = limit;
        this.purchases = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean buy(String productName, double price) {
        if (price > balance) {
            return false;
        }
        TransactionPin transaction = new TransactionPin(productName, price);
        purchases.add(transaction);
        balance -= price;
        return true;
    }

    public List<TransactionPin> getPurchases() {
        return purchases;
    }

    public String listPurchases() {
        StringBuilder sb = new StringBuilder();
        for (TransactionPin transaction : purchases) {
            sb.append(transaction.getProductName()).append(" - R$ ").append(transaction.getPrice()).append("\n");
        }
        return sb.toString();
    }

}
