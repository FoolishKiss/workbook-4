package com.pluralsight;

public class Reservations {

    private String roomType;
    private double price;
    private int nights;
    private boolean isWeekend;


    public Reservations(String roomType, int nights, boolean isWeekend) {
        this.roomType = roomType;
        this.nights = nights;
        this.isWeekend = isWeekend;
        //Price is set based off room type
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else {
            this.price = 124.00;
        }
        //If is weekend is true then add 10% to the price
        if (isWeekend) {
            this.price *= 1.10;

        }
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    //Derived getter returns the total price by multiplying price per night
    public double getTotalPrice() {
        return price * nights;
    }
}
