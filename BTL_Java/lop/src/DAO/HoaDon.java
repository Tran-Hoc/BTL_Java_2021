package DAO;

import java.util.Date;
import java.util.List;

public class HoaDon {
    private String MaHDBan;
    private String MaNhanVien;
    private Date NgayBan;
    private String MaKhach;
    private float TongTien;

    public HoaDon(String maHDBan, String maNhanVien, Date ngayBan, String maKhach, float tongTien) {
        MaHDBan = maHDBan;
        MaNhanVien = maNhanVien;
        NgayBan = ngayBan;
        MaKhach = maKhach;
        TongTien = tongTien;
    }

    public String getMaHDBan() {
        return MaHDBan;
    }

    public void setMaHDBan(String maHDBan) {
        MaHDBan = maHDBan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public Date getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(Date ngayBan) {
        NgayBan = ngayBan;
    }

    public String getMaKhach() {
        return MaKhach;
    }

    public void setMaKhach(String maKhach) {
        MaKhach = maKhach;
    }

    public float getTongTien() {
        return TongTien;
    }

    public void setTongTien(float tongTien) {
        TongTien = tongTien;
    }
}
