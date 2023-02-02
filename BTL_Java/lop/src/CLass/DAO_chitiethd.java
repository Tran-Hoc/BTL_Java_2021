package CLass;
import DAO.ChiTietHD;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO_chitiethd {
        static ConDB kn = new ConDB();
        public static List<ChiTietHD> findAll(){
            List<ChiTietHD> chiTietHDList = new ArrayList<>();
            Connection connection = null;
            Statement statement = null;
            ResultSet resultSet = null;
            String sql = "select * from tblChiTietHDBan";
            try {
                connection = kn.getConnect();
                statement = connection.createStatement();
                resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    ChiTietHD std = new ChiTietHD(resultSet.getString("MaHDBan"),
                            resultSet.getString("MaHang"),
                            resultSet.getFloat("SoLuong"),
                            resultSet.getFloat("DonGia"),
                            resultSet.getFloat("GiamGia"),
                            resultSet.getFloat("ThanhTien"));
                    chiTietHDList.add(std);
                }

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            return chiTietHDList;
        }

        public static void insert(ChiTietHD std) {

            Connection connection = null;
            PreparedStatement statement = null;
            String sql = "insert into tblChiTietHDBan(MaHDBan, MaHang, SoLuong, DonGia, GiamGia, ThanhTien) values(?, ?, ?, ?, ?, ?)";
            try {

                connection = kn.getConnect();

                statement = connection.prepareCall(sql);

                statement.setString(1, std.getMaHDBan());
                statement.setString(2, std.getMaHang());
                statement.setFloat(3, std.getSoluong());
                statement.setFloat(4, std.getDonGia());
                statement.setFloat(5,std.getGiamGia());
                statement.setFloat(6, std.getThanhTien());

                statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public static void update(ChiTietHD std) {

            Connection connection = null;
            PreparedStatement statement = null;
            String sql = "update tblChiTietHDBan set SoLuong=? GiamGia=? ThanhTien=? where MaHang = ? and MaHDBan = ?";
            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);

                statement.setFloat(1, std.getSoluong());
               statement.setFloat(2, std.getGiamGia());
               statement.setFloat(3, std.getThanhTien());
               statement.setString(4,std.getMaHang());
               statement.setString(5,std.getMaHDBan());
                statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        public static void delete(String MaHang, String MaHDBan) {

            Connection connection = null;
            PreparedStatement statement = null;

            String sql = "delete from tblChiTietHDBan where Mahang = ? and MaHDban = ?";
            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);

                statement.setString(1, MaHang);
                statement.setString(2,MaHDBan);
                statement.execute();

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }
        public static List<ChiTietHD> findByMaHang(String MaHang, String MaHDBan) {
            List<ChiTietHD> chiTietHDList = new ArrayList<>();

            Connection connection = null;
            PreparedStatement statement = null;

            String sql = "select * from tblChiTietHDBan where MaHang like ? and MaHDBan like ? ";

            try {

                connection = kn.getConnect();
                statement = connection.prepareCall(sql);
                statement.setString(1, "%"+MaHang+"%");
                statement.setString(2,"%" + MaHDBan+"%");

                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    ChiTietHD std = new ChiTietHD(resultSet.getString("MaHDBan"),
                            resultSet.getString("MaHang"),
                           resultSet.getFloat("SoLuong"),
                            resultSet.getFloat("DonGia"),
                            resultSet.getFloat("GiamGia"),
                            resultSet.getFloat("ThanhTien"));
                    chiTietHDList.add(std);
                }

            } catch (SQLServerException throwables) {
                throwables.printStackTrace();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            return chiTietHDList;
        }
    }


