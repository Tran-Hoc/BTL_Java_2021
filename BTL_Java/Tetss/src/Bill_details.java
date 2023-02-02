public class Bill_details {
    private Product product;
    private int amount;

    public Bill_details(Product product, int amount) {
        this.product = product;
        this.amount = amount;
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

    @Override
    public String toString() {
        return "Bill_details{" +
                "product=" + product +
                ", amount=" + amount +
                '}';
    }
}
