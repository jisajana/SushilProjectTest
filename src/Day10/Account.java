package Day10;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;
    private String accountOpenedDate;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name;}

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountOpenedDate() {
        return accountOpenedDate;
    }

    public void setAccountOpenedDate(String accountOpenedDate) {
        this.accountOpenedDate = accountOpenedDate;
    }



    @Override
    public String toString() {
        return   accountNumber + ";" + name + ";" + balance + ";" + accountOpenedDate + '\n';
    }




}








