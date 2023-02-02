package CLass;
import DAO.*;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_nhanvien {
    static ConDB kn = new ConDB();
    public static List<NhanVien> findAll(){
        List<NhanVien> nhanVienList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from tblNhanVien";
        try {
            connection = kn.getConnect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                NhanVien std = new NhanVien(resultSet.getString("MaNhanVien"),
                        resultSet.getString("TenNhanVien"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("SDT"),
                        resultSet.getDate("NgaySinh")
                        );                        ;
                nhanVienList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return nhanVienList;
    }

    public static void insert(NhanVien std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "insert into tblNhanVien(MaNhanVien, TenNhanVien, GioiTinh, DiaChi, SDT, NgaySinh) values(?, ?, ?, ?, ?, ?)";
        try {

            connection = kn.getConnect();

            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaNV());
            statement.setString(2, std.getTenNV());
            statement.setString(3, std.getGT());
            statement.setString(4, std.getDiaChi());
            statement.setString(5, std.getSDT());
            statement.setDate(6, (Date) std.getNgaySinh());
            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(NhanVien std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "insert into update tblNhanVien set TenNhanVien=?,GioiTinh=?,DiaChi=?, SDT=?,NgaySinh=? where MaNhanVien = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getTenNV());
            statement.setString(2, std.getGT());
            statement.setString(3, std.getDiaChi());
            statement.setString(4, std.getSDT());
            statement.setDate(5, (Date) std.getNgaySinh());
            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(int MaNhanVien) {

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "delete from tblNhanVien where MaNhanVien = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setInt(1, MaNhanVien);

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static List<NhanVien> findByFullname(String TenNhanVien) {
        List<NhanVien>  nhanVienList= new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "select * from tblNhanVien where TenNhanVien like ?";

        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+TenNhanVien+"%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                NhanVien std = new NhanVien(resultSet.getString("MaNhanVien"),
                        resultSet.getString("TenNhanVien"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("SDT"),
                        resultSet.getDate("NgaySinh"));
                nhanVienList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return nhanVienList;
    }
}
