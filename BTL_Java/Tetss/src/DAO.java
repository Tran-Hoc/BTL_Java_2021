import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DAO {


try

    {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("d:/mydata2.bin");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Khai báo mảng
        Bill s;
        //Bước 2: Ghi mảng đối tượng vào file
        try {
            oos.writeObject(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Bước 3: Đóng luồng
        try {
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 catch(Exception e){
        System.out.println("Loi doc file");
    }


    }




