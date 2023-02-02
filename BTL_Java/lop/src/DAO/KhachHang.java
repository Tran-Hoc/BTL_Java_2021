package DAO;

public class KhachHang {
    private String MaKhach;
    private String TenKhach;
    private String DiaChi;
    private String SDT;

    public KhachHang(String maKhach, String tenKhach, String diaChi, String SDT) {
        MaKhach = maKhach;
        TenKhach = tenKhach;
        DiaChi = diaChi;
        this.SDT = SDT;
    }

    public String getMaKhach() {
        return MaKhach;
    }

    public void setMaKhach(String maKhach) {
        MaKhach = maKhach;
    }

    public String getTenKhach() {
        return TenKhach;
    }

    public void setTenKhach(String tenKhach) {
        TenKhach = tenKhach;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }
}
