import java.util.Date;

public class Hang {
   private String Mah;
   private String TenH;
   private String GiaBan;
   private String SlTon;
   private String LoaiHang;

   public Hang(String mah, String tenH, String giaBan, String slTon, String loaiHang) {
      Mah = mah;
      TenH = tenH;
      GiaBan = giaBan;
      SlTon = slTon;
      LoaiHang = loaiHang;
   }

   public String getMah() {
      return Mah;
   }

   public void setMah(String mah) {
      Mah = mah;
   }

   public String getTenH() {
      return TenH;
   }

   public void setTenH(String tenH) {
      TenH = tenH;
   }

   public String getGiaBan() {
      return GiaBan;
   }

   public void setGiaBan(String giaBan) {
      GiaBan = giaBan;
   }

   public String getSlTon() {
      return SlTon;
   }

   public void setSlTon(String slTon) {
      SlTon = slTon;
   }

   public String getLoaiHang() {
      return LoaiHang;
   }

   public void setLoaiHang(String loaiHang) {
      LoaiHang = loaiHang;
   }
}
