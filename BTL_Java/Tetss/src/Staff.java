import java.util.Date;

public class Staff {
    private Date dob;
    private String name;
    private float salary;
    private int id;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "dob=" + dob +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
