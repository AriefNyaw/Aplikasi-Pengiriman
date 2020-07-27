package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;

public class kon {
    static Connection conn;
    public static  Connection conn(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jasa_pengiriman", "root", "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
     public static void main (String args[]){
        System.out.println(kon.conn());
    }
}
