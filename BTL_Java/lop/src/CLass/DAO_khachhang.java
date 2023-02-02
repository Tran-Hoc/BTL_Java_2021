package CLass;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_khachhang {
    static ConDB kn = new ConDB();
    public static List<KhachHang> findAll(){
        List<KhachHang> khachHangList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from tblKhach";
        try {
            connection = kn.getConnect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                KhachHang std = new KhachHang(resultSet.getString("Makhach"),
                        resultSet.getString("TenKhach"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("SDT"));
                khachHangList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return khachHangList;
    }

    public static void insert(KhachHang std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "insert into tblKhach(MaKhach, TenKhach, DiaChi, SDT) values(?, ?, ?, ?, ?)";
        try {

            connection = kn.getConnect();

            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaKhach());
            statement.setString(2, std.getTenKhach());
            statement.setString(3, std.getDiaChi());
            statement.setString(4, std.getSDT());

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(KhachHang std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = " update tblKhach set TenKhach=?,DiaChi=?,SDT=? where MaKhach = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getTenKhach());
            statement.setString(2, std.getDiaChi());
            statement.setString(3, std.getSDT());

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(String MaKhach) {

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "delete from tblKhach where MaKhach = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setString(1, MaKhach);

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static List<KhachHang> findByFullname(String TenKhach) {
        List<KhachHang> khachHangList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "select * from tblKhach where TenKhach like ?";

        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+TenKhach+"%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                KhachHang std = new KhachHang(resultSet.getString("Makhach"),
                        resultSet.getString("TenKhach"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("SDT"));
                khachHangList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return khachHangList;
    }
}
