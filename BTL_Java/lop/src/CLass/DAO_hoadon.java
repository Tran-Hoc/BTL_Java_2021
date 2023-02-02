package CLass;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_hoadon {
        static ConDB kn = new ConDB();
        public static List<HoaDon> findAll(){
            List<HoaDon> hoaDonList = new ArrayList<>();
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            String sql = "select * from tblHDBan";
            try {
                connection = kn.getConnect();
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    HoaDon std = new HoaDon(resultSet.getString("MaHDBan"),
                            resultSet.getString("MaNhanVien"),
                            resultSet.getDate("NgayBan"),
                            resultSet.getString("MaKhach"),
                            resultSet.getFloat("TongTien"));
                    hoaDonList.add(std);
                }

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return hoaDonList;
        }

        public static void insert(HoaDon std) {

            Connection connection = null;
            PreparedStatement statement = null;
            String sql = "insert into tblHDBan(MaHDBan, MaNhanVien, NgayBan, MaKhach, TongTien) values(?, ?, ?, ?, ?)";
            try {

                connection = kn.getConnect();

                statement = connection.prepareCall(sql);

                statement.setString(1, std.getMaHDBan());
                statement.setString(2, std.getMaNhanVien());
                statement.setDate(3, (Date) std.getNgayBan());
                statement.setString(4, std.getMaKhach());
                statement.setFloat(5,std.getTongTien());
                statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public static void update(HoaDon std) {

            Connection connection = null;
            PreparedStatement statement = null;
            String sql = " update tblHDBan set TongTien=? where MaHDBan = ?";
            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);

                statement.setFloat(1, std.getTongTien());
                statement.setString(2, std.getMaHDBan());

                 statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public static void delete(int MaHDBan) {

            Connection connection = null;
            PreparedStatement statement = null;

            String sql = "delete from tblHDBan where MaHDBan = ?";
            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);

                statement.setInt(1, MaHDBan);

                statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        public static List<HoaDon> findByFullDate(Date Ngayban) {
            List<HoaDon> hoaDonList = new ArrayList<>();

            Connection connection = null;
            PreparedStatement statement = null;

            String sql = "select * from tblHDBan where NgayBan like ?";

            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);
                statement.setDate(1, Date.valueOf("%"+Ngayban+"%"));

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    HoaDon std = new HoaDon(resultSet.getString("MaHDBan"),
                            resultSet.getString("MaNhanVien"),
                            resultSet.getDate("NgayBan"),
                            resultSet.getString("MaKhach"),
                            resultSet.getFloat("TongTien"));
                    hoaDonList.add(std);
                }

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return hoaDonList;
        }
    }


