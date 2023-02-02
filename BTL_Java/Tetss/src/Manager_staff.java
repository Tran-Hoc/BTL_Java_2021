import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Manager_staff {
    private List<Staff> staff;
    // them nv, xóa, hien thị, tìm kiếm theo tên
    public Manager_staff(){
        this.staff = new ArrayList<>();

    }
    public void addStaff(Staff staff){
        this.staff.add(staff);
    }
    public List<Staff> searchStaffByName(String name){
        return this.staff.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }

    public void showListInforStaff(){
        this.staff.forEach(o-> System.out.println(o.toString()));
    }
    public void deleteListStaffByName(String name){
        searchStaffByName(name).forEach((staff1 -> {
            staff.remove(this.staff);
        }));
    }

}
