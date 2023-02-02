package DAO;

import java.util.Date;

public class NhanVien {
    private String MaNV;
    private String TenNV;
    private String GT;
    private String DiaChi;
    private String SDT;
    private Date NgaySinh;

    public NhanVien(String maNV, String tenNV, String GT, String diaChi, String SDT, Date ngaySinh) {
        MaNV = maNV;
        TenNV = tenNV;
        this.GT = GT;
        DiaChi = diaChi;
        this.SDT = SDT;
        NgaySinh = ngaySinh;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String maNV) {
        MaNV = maNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String tenNV) {
        TenNV = tenNV;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
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

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }
}
