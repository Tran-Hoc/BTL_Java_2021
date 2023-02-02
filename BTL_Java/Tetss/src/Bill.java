import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Bill {
    private Staff staff;
    private Customer customer;

    private Date time_buy;// thoi gian mua
    private String name_seller;
    private String name_customer;
    private String id_customer;
    private String id_seller;
    private List<Bill_details> billDetailsList = new ArrayList<>();
    public Bill(){}

    public Bill(Date time_buy, String name_seller, String name_customer, String id_customer, String id_seller) {
        this.time_buy = time_buy;
        this.name_seller = name_seller;
        this.name_customer = name_customer;
        this.id_customer = id_customer;
        this.id_seller = id_seller;
    }
    public Date getTime_buy() {
        return time_buy;
    }

    public void setTime_buy(Date time_buy) {
        this.time_buy = time_buy;
    }

    public String getName_seller() {
        return name_seller;
    }

    public void setName_seller(Staff staff) {
        this.name_seller = staff.getName();
    }

    public void addBill(Bill_details billDetails){
        this.billDetailsList.add(billDetails);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "time_buy=" + time_buy +
                ", name_seller='" + name_seller + '\'' +
                ", name_customer='" + name_customer + '\'' +
                ", billDetailsList=" + billDetailsList +
                '}';
    }
}
