package com.example.demo_shushilday20;

import java.sql.*;
import java.util.Scanner;

public class LaptopWithSwitchAndCase {
    public static void main(String[] args) throws SQLException {
        LaptopWithSwitchAndCase laptop = new LaptopWithSwitchAndCase();
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
        try {
            Scanner scanner = new Scanner(System.in);
            DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

            System.out.println("Enter laptop ID that you want to update details: ");
            int idChosen = scanner.nextInt();

            PreparedStatement pst = conn.prepareStatement("UPDATE LAPTOP SET NAME=?, BRAND=?, PRICE=?  WHERE ID=? ");

            System.out.println("Enter updated laptop name: ");
            String updatedLaptopName = scanner.next();

            System.out.println("Enter updated laptop brand: ");
            String updatedLaptopBrand = scanner.next();

            System.out.println("Enter updated laptop Price: ");
            Double updatedLaptopPrice = scanner.nextDouble();

            pst.setString(1, updatedLaptopName);
            pst.setString(2, updatedLaptopBrand);
            pst.setDouble(3, updatedLaptopPrice);
            pst.setInt(4, idChosen);

            int rows = pst.executeUpdate();
            System.out.println("Rows updated : " + rows);

            pst.close();
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public  void delete (){
        try {
            Scanner scanner = new Scanner(System.in);
            DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

            System.out.println("Choose laptop ID that you want to delete details: ");
            int idChosen = scanner.nextInt();

            PreparedStatement pst = conn.prepareStatement("DELETE FROM LAPTOP WHERE ID = ?");

            pst.setInt(1,idChosen);

            int rows = pst.executeUpdate();
            System.out.println("Rows deleted : "+rows);

            pst.close();
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public  void display(){
        try {
            DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
            Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM LAPTOP");

            System.out.println("Printing laptop details from Database............");
            System.out.println("***********************************************");
            while (rs.next()) {
                System.out.print("ID: " + rs.getInt(1) + "\n");
                System.out.print("laptop name: " + rs.getString(2) + "\n");
                System.out.print("laptop brand: " + rs.getString(3) + "\n");
                System.out.println("laptop Price: $" + rs.getDouble(4) + "\n");
                System.out.println("===================================================");
            }
            rs.close();
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public  void insert(){
        for (int i = 0; i < 2; i++) {
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
    }

   /* public  void insertintolog( String action_type){

        Date dateTime = null;
        ArrayList loglist = new ArrayList();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter username: ");
            String username = scanner.next();

            int userInput = scanner.nextInt();

            if (userInput ==1){
                action_type ="create";
            }
            if (userInput ==2){
                action_type ="delete";
            }
            if (userInput ==3){
                action_type ="update";
            }
            if (userInput ==4){
                action_type ="read";
            }


            try {
                DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
                Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");

                PreparedStatement pst = conn.prepareStatement("insert into log values (?,?,?,?,?)");

                pst.setInt(1, id);
                pst.setString(2, username);
                pst.setString(3, action_type);
                pst.setDate(4,dateTime );
                loglist.add(id);
                loglist.add(username);
                loglist.add(action_type);
                loglist.add(dateTime);
                loglist.add(id);


                pst.setArray(id,username,action_type,dateTime);



                int rows = pst.executeUpdate();
                System.out.println("Rows inserted : " + rows);

                pst.close();
                conn.close();

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }*/
}

