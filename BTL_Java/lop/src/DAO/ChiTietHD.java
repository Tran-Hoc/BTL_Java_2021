package DAO;
public class ChiTietHD {
    private String MaHDBan;
    private String MaHang;
    private float Soluong;
    private float DonGia;
    private float GiamGia;
    private float ThanhTien;

    public ChiTietHD(String maHDBan, String maHang, float soluong, float donGia, float giamGia, float thanhTien) {
        MaHDBan = maHDBan;
        MaHang = maHang;
        Soluong = soluong;
        DonGia = donGia;
        GiamGia = giamGia;
        ThanhTien = thanhTien;
    }

    public String getMaHDBan() {
        return MaHDBan;
    }

    public void setMaHDBan(String maHDBan) {
        MaHDBan = maHDBan;
    }

    public String getMaHang() {
        return MaHang;
    }
    
    public void setMaHang(String maHang) {
        MaHang = maHang;
    }

    public float getSoluong() {
        return Soluong;
    }

    public void setSoluong(float soluong) {
        Soluong = soluong;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float donGia) {
        DonGia = donGia;
    }

    public float getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(float giamGia) {
        GiamGia = giamGia;
    }

    public float getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(float thanhTien) {
        ThanhTien = thanhTien;
    }
}
