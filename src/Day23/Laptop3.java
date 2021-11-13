package Day23;

import java.sql.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class Laptop3 {
    private Connection connection;

    public Laptop3() {
        try {
            //DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            this.connection = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {
        Laptop3 laptop = new Laptop3();
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
                    laptop.closeExit();
            }
            System.out.println("Want to continue. Enter 'Y' to 'continue' and 'N' to 'exit' ");
            more = scanner.next();
        }
    }

    public void update() {
        String actionType = "update";
        int idChosen = 0;
        String updatedLaptopName = "";
        String updatedLaptopBrand = "";
        Double updatedLaptopPrice = 0.00;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter laptop ID that you want to update details: ");
        idChosen = scanner.nextInt();
        if (!isIdInLaptopValid(idChosen)) {
            System.out.println("ID not found on Laptop database for updating");
            return;
        }

        try {
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
        insertIntoLog(actionType, "laptop ID: " + idChosen +
                "; laptop Name: " + updatedLaptopName +
                "; laptop Brand: " + updatedLaptopBrand +
                "; laptop Price: " + updatedLaptopPrice);
    }


    public void delete() {
        String actionType = "delete";
        int idChosen;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose laptop ID that you want to delete details: ");
        idChosen = scanner.nextInt();

        if (!isIdInLaptopValid(idChosen)) {
            System.out.println("ID not found on Laptop database for deleting");
            return;
        }
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP where ID = " + idChosen);

            rs.next();

            int laptopID = rs.getInt(1);
            String laptopName = rs.getString(2);
            String laptopBrand = rs.getString(3);
            Double laptopPrice = rs.getDouble(4);

            insertIntoLog(actionType, "laptop ID: " + laptopID +
                    "; laptop Name: " + laptopName +
                    "; laptop Brand: " + laptopBrand +
                    "; laptop Price: " + laptopPrice);

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
            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            System.out.println("Printing laptop details from Database............");
            while (rs.next()) {
                System.out.print(resultSetMetaData.getColumnName(1)+ " " + rs.getInt(1) + "; ");
                System.out.print(resultSetMetaData.getColumnName(2) + " " + rs.getString(2) + "; ");
                System.out.print(resultSetMetaData.getColumnName(3) + " " + rs.getString(3) + "; ");
                System.out.println(resultSetMetaData.getColumnName(4)+ " " + rs.getDouble(4));
            }
            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LOG");
            ResultSetMetaData resultSetMetaData = rs.getMetaData();

            System.out.println("==============================================================");
            System.out.println("Printing Logs from Database............");
            while (rs.next()) {
                System.out.print(resultSetMetaData.getColumnName(1)+" " + rs.getInt(1));
                System.out.print(resultSetMetaData.getColumnName(2)+" " + rs.getString(2));
                System.out.print(resultSetMetaData.getColumnName(3)+" " + rs.getString(3));
                System.out.println(resultSetMetaData.getColumnName(4)+" " + rs.getDate(4));
                System.out.println(resultSetMetaData.getColumnName(5)+" " + rs.getString(5));
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
            int laptopID = 0;
            Double laptopPrice = 0.00;

            System.out.println("Enter laptop id: ");
            try {
                laptopID = scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println("Invalid Laptop ID. Laptop details not added on Laptop database");
                break;
            }

            System.out.println("Enter laptop name: ");

            String laptopName = scanner.next();

            System.out.println("Enter laptop brand: ");
            String laptopBrand = scanner.next();

            System.out.println("Enter laptop Price: ");
            try {
                laptopPrice = scanner.nextDouble();
            } catch (InputMismatchException exception) {
                System.out.println("Price not valid. Laptop details not added on Laptop database.");
                break;
            }

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

            insertIntoLog(actionType, "laptop ID: " + laptopID +
                    "; laptop Name: " + laptopName +
                    "; laptop Brand: " + laptopBrand +
                    "; laptop Price: " + laptopPrice);
        }
    }

    public void insertIntoLog(String actionType, String data) {
        try {
            PreparedStatement pst = this.connection.prepareStatement("insert into Log (username, action_type,date_time, data) values (?,?,?,?)");

            pst.setString(1, "Sajana");
            pst.setString(2, actionType);
            pst.setDate(3, new Date(System.currentTimeMillis()));
            pst.setString(4, data);

            int rows = pst.executeUpdate();
            System.out.println("Rows inserted on Log Table : " + rows);

            pst.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public boolean isIdInLaptopValid(int idChosen) {
        try {
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP where id =" + idChosen);

            if (rs.next()) {
                /*System.out.print("ID: " + rs.getInt(1));*/
                return true;
            }

            rs.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }

    public void closeExit() {
        System.out.println("Exiting from the system ");

        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}



