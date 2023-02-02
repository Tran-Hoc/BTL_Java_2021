import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLiNV {
    private List<nhanvien>  nhanvienList;

    public QuanLiNV(List<nhanvien> nhanvienList) {
        nhanvienList = new ArrayList<>();
    }
    public void addNhanVien(nhanvien nhanvien)
    {
        this.nhanvienList.add(nhanvien);
    }
    public List<nhanvien> timkiemNVtheoten(String name){
        return this.nhanvienList.stream().filter(o->o.getHoTenNV().contains(name)).collect(Collectors.toList());

    }
    public void deleteListNVbyName(String name)
    {
        nhanvien nhanvien = this.nhanvienList.stream().
    }
}
