package formsibddrag.drop.koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class koneksi {

    public static Connection con;
    public static Statement stm;

    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/penjualan";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url, user, pass);
            stm = con.createStatement();

            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            System.out.println("Gagal" + e.getMessage());
        }
    }
}
