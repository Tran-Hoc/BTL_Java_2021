import java.util.Date;

public class Product {
    private String name;
    private String id;
    private float price;// gia ban
    private float pur_price;// gia nhap
    private Date date_imp;// ngay nhap
    private Date date_exp; // ngay xuat
    private Date prd, exp;// ngay san xuat, han su dung
    private int amount;// so luong

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", pur_price=" + pur_price +
                ", date_add=" + date_imp +
                ", date_issue=" + date_exp +
                ", prd=" + prd +
                ", exp=" + exp +
                ", size=" + amount +
                '}';
    }
}
