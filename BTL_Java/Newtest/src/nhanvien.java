public class nhanvien{
    private String MaNV;
    private String HoTenNV;
    private int SDT;

    public nhanvien(String maNV, String hoTenNV, int SDT) {
        MaNV = maNV;
        HoTenNV = hoTenNV;
        this.SDT = SDT;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getHoTenNV() {
        return HoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        HoTenNV = hoTenNV;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
}