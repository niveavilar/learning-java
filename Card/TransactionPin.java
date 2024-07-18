package cartao;


public class TransactionPin {
    private String productName;
    private double price;

    public TransactionPin(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName.substring(0, 1).toUpperCase() + productName.substring(1);
    }


    public double getPrice() {
        return price;
    }

}
