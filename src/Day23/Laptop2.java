package Day23;

import java.sql.*;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Laptop2 {
    private Connection connection;

    public Laptop2() {
        try {
            //DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            this.connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Laptop2 laptop = new Laptop2();
        Scanner scanner = new Scanner(System.in);
        String more = "Y";
        while (more.equalsIgnoreCase("Y")) {
            System.out.println("Option [1] - insert laptop details");
            System.out.println("Option [2] - delete laptop details");
            System.out.println("Option [3] - update laptop details");
            System.out.println("Option [4] - display laptop details");
            System.out.println("Option [5] - Exit");
            System.out.println("Choose an option from above: ");

            int userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    laptop.insert();
                    break;

                case 2:
                    laptop.delete();
                    break;

                case 3:
                    laptop.update();
                    break;

                case 4:
                    laptop.display();
                    break;

                case 5:
                    System.out.println("Exiting the system");
                    System.exit(0);
            }

            System.out.println("Want to continue. Enter 'Y' to 'continue' and 'N' to 'exit' ");
            more = scanner.next();
        }
    }

    public void update() {
        int idChosen = 0;
        String updatedLaptopName = "";
        String updatedLaptopBrand = "";
        Double updatedLaptopPrice = 0.00;

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter laptop ID that you want to update details: ");
            idChosen = scanner.nextInt();

            PreparedStatement pst = this.connection.prepareStatement("UPDATE LAPTOP SET NAME=?, BRAND=?, PRICE=?  WHERE ID=? ");

            System.out.println("Enter updated laptop name: ");
            updatedLaptopName = scanner.next();

            System.out.println("Enter updated laptop brand: ");
            updatedLaptopBrand = scanner.next();

            System.out.println("Enter updated laptop Price: ");
            updatedLaptopPrice = scanner.nextDouble();

            pst.setString(1, updatedLaptopName);
            pst.setString(2, updatedLaptopBrand);
            pst.setDouble(3, updatedLaptopPrice);
            pst.setInt(4, idChosen);

            int rows = pst.executeUpdate();
            System.out.println("Rows updated on Laptop Table: " + rows);

            pst.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            PreparedStatement pst = this.connection.prepareStatement("insert into Log (username, action_type,date_time, data) values (?,?,?,?)");

            /*pst.setInt(1, 1);*/
            pst.setString(1, "Sajana");
            pst.setString(2, "update");
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.setString(4, "laptop ID: " + idChosen +
                    "; laptop Name: " + updatedLaptopName +
                    "; laptop Brand: " + updatedLaptopBrand +
                    "; laptop Price: " + updatedLaptopPrice);


            int rows = pst.executeUpdate();
            System.out.println("Rows inserted on Log Table : " + rows);

            pst.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void delete() {
        int idChosen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose laptop ID that you want to delete details: ");
        idChosen = scanner.nextInt();

        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP where ID = " + idChosen);

            rs.next();
            int laptopID = rs.getInt(1);
            String laptopName = rs.getString(2);
            String laptopBrand = rs.getString(3);
            Double laptopPrice = rs.getDouble(4);

            /*System.out.println(laptopID + laptopName + laptopBrand + laptopPrice);*/

            PreparedStatement pst = this.connection.prepareStatement("insert into Log (username, action_type,date_time, data) values (?,?,?,?)");

            /*pst.setInt(1, 3);*/
            pst.setString(1, "Sajana");
            pst.setString(2, "delete");
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.setString(4, "laptop ID: " + laptopID +
                    "; laptop Name: " + laptopName +
                    "; laptop Brand: " + laptopBrand +
                    "; laptop Price: " + laptopPrice);


            int rows = pst.executeUpdate();
            System.out.println("Rows inserted on Log Table : " + rows);

            rs.close();
            pst.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            PreparedStatement pst = this.connection.prepareStatement("DELETE FROM LAPTOP WHERE ID = ?");

            pst.setInt(1, idChosen);

            int rows = pst.executeUpdate();
            System.out.println("Rows deleted from Laptop table: " + rows);

            pst.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void display() {
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP");

            System.out.println("Printing laptop details from Database............");
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt(1) + "; ");
                System.out.print("laptop name: " + rs.getString(2) + "; ");
                System.out.print("laptop brand: " + rs.getString(3) + "; ");
                System.out.println("laptop Price: $" + rs.getDouble(4));
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOG");

            System.out.println("==============================================================");
            System.out.println("Printing Logs from Database............");
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt(1));
                System.out.print("; username: " + rs.getString(2));
                System.out.print("; action_type: " + rs.getString(3));
                System.out.println("; Date: " + rs.getDate(4));
                System.out.println("; Data: " + rs.getString(5));
            }
            rs.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void insert() {
        String actionType = "insert";
        for (int i = 0; i < 1; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter laptop id: ");
            int laptopID = scanner.nextInt();

            System.out.println("Enter laptop name: ");
            String laptopName = scanner.next();

            System.out.println("Enter laptop brand: ");
            String laptopBrand = scanner.next();

            System.out.println("Enter laptop Price: ");
            Double laptopPrice = scanner.nextDouble();

            try {
                PreparedStatement pst = this.connection.prepareStatement("insert into LAPTOP values (?,?,?,?)");

                pst.setInt(1, laptopID);
                pst.setString(2, laptopName);
                pst.setString(3, laptopBrand);
                pst.setDouble(4, laptopPrice);

                int rows = pst.executeUpdate();
                System.out.println("Rows inserted on Laptop Table : " + rows);

                pst.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

            insertintolog(actionType,"laptop ID: " + laptopID +
                    "; laptop Name: " + laptopName +
                    "; laptop Brand: " + laptopBrand +
                    "; laptop Price: " + laptopPrice );

            /*try {
                DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
                Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

                PreparedStatement pst = conn.prepareStatement("insert into Log (username, action_type,date_time, data) values (?,?,?,?)");

                *//*pst.setInt(1, 1);*//*
                pst.setString(1, "Sajana");
                pst.setString(2, "insert");
                pst.setDate(3, new Date(System.currentTimeMillis()));
                pst.setString(4, "laptop ID: " + laptopID +
                        "; laptop Name: " + laptopName +
                        "; laptop Brand: " + laptopBrand +
                        "; laptop Price: " + laptopPrice);


                int rows = pst.executeUpdate();
                System.out.println("Rows inserted on Log Table : " + rows);

                pst.close();
                conn.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }*/
        }
    }

    public  void insertintolog( String actionType, String data){
        try {
            PreparedStatement pst = this.connection.prepareStatement("insert into Log (username, action_type,date_time, data) values (?,?,?,?)");

            pst.setString(1, "Sajana");
            pst.setString(2, actionType);
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.setString(4,data);

            int rows = pst.executeUpdate();
            System.out.println("Rows inserted on Log Table : " + rows);

            pst.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}


