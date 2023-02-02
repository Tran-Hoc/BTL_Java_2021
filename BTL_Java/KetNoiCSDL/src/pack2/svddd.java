package pack2;
import pack1.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class svddd {
           static ConDb kn = new ConDb();
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
            Connection conn = kn.getConDB();
            //Statement stm = null;
            PreparedStatement stm = null;
            ResultSet rs = null;
            String sql = "select * from dbo.student";
            Scanner sc = new Scanner(System.in);
            //in danh sach
            try {
                stm = conn.prepareCall(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    System.out.println("id: " + rs.getString(1) + "\tName: " + rs.getString(2) + "\tAddress: "+ rs.getString(3));
                }
//            System.out.println("Delete id: ");
//
//            int id = sc.nextInt();
//            System.out.println("Name: ");
//            sc.nextLine();
//            String name = sc.nextLine();
//
//            String sql_del="delete from dbo.student where id = ? and name = ?";
//            stm = conn.prepareCall(sql_del);
//            stm.setInt(1, id);
//            stm.setString(2,name);
//            stm.execute();
//            stm = conn.prepareCall(sql);
//            rs = stm.executeQuery();
//
//            while(rs.next()){
//                System.out.println("id: " + rs.getString(1) + "\tName: " + rs.getString(2) + "\tAddress: "+ rs.getString(3));
//            }

//            System.out.println("Input: ");
//            System.out.println("id: ");
//            int id1 = sc.nextInt();
//            System.out.println("Name: ");
//            sc.nextLine();
//            String name = sc.nextLine();
//            System.out.println("Address: ");
//            String address = sc.nextLine();
//            String sql_insert = "insert into dbo.student(id, name, address) values(?,?,?)";
//            stm = conn.prepareCall(sql_insert);
//            stm.setInt(1, id1);
//            stm.setString(2, name);
//            stm.setString(3, address);
//            stm.execute();
//
//            stm = conn.prepareCall(sql);
//            rs = stm.executeQuery();
//            while(rs.next()){
//                System.out.println("id: " + rs.getString(1) + "\tName: " + rs.getString(2) + "\tAddress: "+ rs.getString(3));
//            }
//
                System.out.println("Search by name: ");
                String names = sc.nextLine();
                System.out.println("ID: ");
                int ids = sc.nextInt();
                String sql_search = "select *from dbo.student where name like ? and id like ?";
                stm = conn.prepareCall(sql_search);
                stm.setString(1, "%" + names + "%");
                stm.setString(2,"%" + ids + "%");
                rs = stm.executeQuery();
                while(rs.next()){
                    System.out.println("Id: " + rs.getInt("id") +
                            " Name: " + rs.getString("name") +
                            " address: " + rs.getString("address"));
                }
//            String sql_update = "update dbo.student set name= ? where id = ?" ;
//            stm = conn.prepareStatement(sql_update);
//
//            System.out.println("Update");
//            System.out.println("Id: ");
//            int id2 = sc.nextInt();
//            sc.nextLine();
//            System.out.println("Name: ");
//            String name2 = sc.nextLine();
//            System.out.println("Address: ");
//            String address2 = sc.nextLine();
//
//           stm.setString(1, name2);
//           stm.setString(2, address2);
//            stm.setInt(2, id2);
//           stm.execute();

//           rs = stm.executeQuery();
//            while(rs.next()){
//                System.out.println("Id: " + rs.getInt("id") +
//                        " Name: " + rs.getString("name") +
//                        " address: " + rs.getString("address"));
//            }

            }
            catch(Exception e){
                System.out.println("That bai!: " + e);
            }

        }
    }


