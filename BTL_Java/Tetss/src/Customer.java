import java.util.Date;

public class Customer {
    private String name;
    private Date date_buy;
    private int id;

    public Customer(String name, Date date_buy, int id) {
        this.name = name;
        this.date_buy = date_buy;
        this.id = id;
    }

    public int getId(int id_cus) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_buy() {
        return date_buy;
    }

    public void setDate_buy(Date date_buy) {
        this.date_buy = date_buy;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", date_buy=" + date_buy +
                ", id='" + id + '\'' +
                '}';
    }
}
