package Day30.Question2;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelBooking1 {
    private  int cusId;
    private String cusName;
    private String cusEmail;
    private String address;
    private int cusPhone;
    private String roomType;
    ArrayList<HotelBooking1> guestList;

    public HotelBooking1(int cusId, String cusName, String cusEmail, String address, int cusPhone, String roomType, ArrayList guestList) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusEmail = cusEmail;
        this.address = address;
        this.cusPhone = cusPhone;
        this.roomType = roomType;
        this.guestList = guestList;
    }

   public HotelBooking1() {
    }

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(int cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return "{" +
                "cusId=" + cusId +
                ", cusName='" + cusName + '\'' +
                ", cusEmail='" + cusEmail + '\'' +
                ", address='" + address + '\'' +
                ", cusPhone=" + cusPhone +
                ", roomType=" + roomType +
                '}';
    }

    public ArrayList<HotelBooking1> register() {

        //HotelBooking1 hotelBooking1 = new HotelBooking1(1, "Sajana", "jisajana", "102", 10000000)

        //HotelBooking1 hotelBooking1 = new HotelBooking1(cusId, cusName, cusEmail,address,cusPhone, roomType);

        guestList.add(new HotelBooking1(cusId, cusName, cusEmail,address,cusPhone, roomType, guestList));
        return guestList;
    }

    public double roomCharge(String roomType){
        double totalAmount = 0;
        if (roomType.equalsIgnoreCase("Single")){
            totalAmount = 600.00;
        }
        if (roomType.equalsIgnoreCase("Double")){
            totalAmount = 1000.00;
        }
        return totalAmount;
    }

    public void display(){
        //for

    }

    public void displayReceipt(){
        System.out.println();
    }

    /*public void booking(){
        System.out.println("Customer " + cusName + "has booked ");
    }*/
}


