import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConDb {

    public Connection getConDB() throws SQLException, ClassNotFoundException {

        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("LAPTOP-4OO3T4KH");
        ds.setPortNumber(1433);
        ds.setDatabaseName("testdb");
        Connection cnn = ds.getConnection();
        try {

//            String url = "jdbc:sqlserver://LAPTOP-4OO3T4KH:1433;databaseName=test[sa on dbo]";
//            String user = "sa";
//            String pass = "123";
//            Class.forName("com.microsofrt.sqlserver.jdbc.SQlServerDriver");
//            cnn = DriverManager.getConnection(url, user, pass);
            System.out.println("Thanh cong!");
        } catch (Exception e) {
            System.out.println("Khong thanh cong!");
        }
        return cnn;
    }
}
