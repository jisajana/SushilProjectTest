import javax.xml.crypto.Data;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Laptop1 {
    public static void main(String[] args) throws SQLException {
//     ArrayList<laptopDetails> laptopArray = new ArrayList<laptopDetails>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter laptop id: ");
            int laptopID = scanner.nextInt();

            System.out.println("Enter laptop name: ");
            String laptopName = scanner.next();

            System.out.println("Enter laptop brand: ");
            String laptopBrand = scanner.next();

            System.out.println("Enter laptop Price: ");
            Double laptopPrice = scanner.nextDouble();

/*          laptopDetails laptopObject = new laptopDetails(laptopName, laptopBrand, laptopPrice);
            laptopArray.add(laptopObject);
                  }
//      System.out.println(laptopArray);
        for (int i =0; i<laptopArray.size();i++){
           System.out.println(laptopArray);
        }*/
            try {
                DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
                Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

                PreparedStatement pst = conn.prepareStatement("insert into LAPTOP values (?,?,?,?)");

                pst.setInt(1, laptopID);
                pst.setString(2, laptopName);
                pst.setString(3, laptopBrand);
                pst.setDouble(4, laptopPrice);

                int rows = pst.executeUpdate();
                System.out.println("Rows inserted : " + rows);

                pst.close();
                conn.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        try {
            DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP");

            System.out.println("Printing laptop details from Database............");
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt(1) + "; ");
                System.out.print("laptop name: " + rs.getString(2) + "; ");
                System.out.print("laptop brand: " + rs.getString(3) + "; ");
                System.out.println("laptop Price: $" + rs.getDouble(4));
//          System.out.println("-----------------------------");
            }
            rs.close();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


/*    class laptopDetails {
        String laptopName;
        String laptopBrand;
        Double laptopPrice;

        public laptopDetails(String laptopName, String laptopBrand, Double laptopPrice) {
            this.laptopName = laptopName;
            this.laptopBrand = laptopBrand;
            this.laptopPrice = laptopPrice;
        }
        @Override
        public String toString() {
            return "{" +
                    "laptopName='" + laptopName + '\'' +
                    ", laptopBrand='" + laptopBrand + '\'' +
                    ", laptopPrice=" + laptopPrice +
                    '}';
        }*/
    }
}


