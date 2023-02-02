package DAO;

public class HangHoa {
    private String MaHang;
    private String TenHang;
    private float SoLuong;
    private float DonGiaNhap;
    private float DonGiaBan;

    public HangHoa(String maHang, String tenHang, float soLuong, float donGiaNhap, float donGiaBan) {
        MaHang = maHang;
        TenHang = tenHang;
        SoLuong = soLuong;
        DonGiaNhap = donGiaNhap;
        DonGiaBan = donGiaBan;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }

    public float getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(float soLuong) {
        SoLuong = soLuong;
    }

    public float getDonGiaNhap() {
        return DonGiaNhap;
    }

    public void setDonGiaNhap(float donGiaNhap) {
        DonGiaNhap = donGiaNhap;
    }

    public float getDonGiaBan() {
        return DonGiaBan;
    }

    public void setDonGiaBan(float donGiaBan) {
        DonGiaBan = donGiaBan;
    }
}
