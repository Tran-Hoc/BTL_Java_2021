package CLass;
import DAO.*;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_hanghoa {
    static ConDB kn = new ConDB();
    public static List<HangHoa> findAll(){
        List<HangHoa> hangHoaList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from tblHang";
        try {
            connection = kn.getConnect();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                HangHoa std = new HangHoa(resultSet.getString("MaHang"),
                        resultSet.getString("TenHang"),
                        resultSet.getFloat("SoLuong"),
                        resultSet.getFloat("DonGiaNhap"),
                        resultSet.getFloat("DonGiaBan"));
                hangHoaList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return hangHoaList;
    }
    public static void insert(HangHoa std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "insert into tblHang(MaHang, TenHang, SoLuong, DonGiaNhap, DonGiaBan) values(?, ?, ?, ?, ?)";
        try {

            connection = kn.getConnect();

            statement = connection.prepareCall(sql);

            statement.setString(1, std.getMaHang());
            statement.setString(2, std.getTenHang());
            statement.setFloat(3, std.getSoLuong());
            statement.setFloat(4, std.getDonGiaNhap());
            statement.setFloat(5, std.getDonGiaBan());

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void update(HangHoa std) {

        Connection connection = null;
        PreparedStatement statement = null;
        String sql = "update tblHang set TenHang=?,SoLuong=?,DonGiaNHap=?, DonGiaBan=? where MaHang = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setString(1, std.getTenHang());
            statement.setFloat(2, std.getSoLuong());
            statement.setFloat(3, std.getDonGiaNhap());
            statement.setFloat(4, std.getDonGiaBan());
            statement.setString(5,std.getMaHang());
            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(int MaHang) {

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "delete from tblHang where MaHang = ?";
        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);

            statement.setInt(1, MaHang);

            statement.execute();

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
    public static List<HangHoa> findByFullname(String TenHang) {
        List<HangHoa> hangHoaList = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        String sql = "select * from tblHang where TenHang like ?";

        try {

            connection = kn.getConnect();
            statement = connection.prepareCall(sql);
            statement.setString(1, "%"+TenHang+"%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                HangHoa std = new HangHoa(resultSet.getString("MaHang"),
                        resultSet.getString("TenHang"),
                        resultSet.getFloat("SoLuong"),
                        resultSet.getFloat("DonGiaNhap"),
                        resultSet.getFloat("DonGiaBan"));
                hangHoaList.add(std);
            }

        } catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hangHoaList;
    }
}
