package CLass;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

public class ConDB {

        public Connection getConnect() throws SQLServerException {
            SQLServerDataSource ds = new SQLServerDataSource();
            ds.setUser("sa");
            ds.setPassword("123");
            ds.setServerName("LAPTOP-4OO3T4KH");
            ds.setPortNumber(1433);
            ds.setDatabaseName("BanHang");
            Connection cnn = ds.getConnection();
            try{
                System.out.println("Thanh Cong!");
            }
            catch (Exception e){
                System.out.println("That bai!");
            }
            return cnn;
        }
    }

