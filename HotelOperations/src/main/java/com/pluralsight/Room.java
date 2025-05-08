package com.pluralsight;

public class Room {

    //Variables for rooms
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //Constructor
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //Derived getter, checks availability based on isOccupied and isDirty
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    //Method to check in, sets the room to occupied and dirty
    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
            System.out.println("com.pluralsight.Room has been checked in.");
        } else {
            System.out.println("com.pluralsight.Room cannot be checked in.");
        }
    }
    //Method to check out, clears room if occupied
    public void checkOut() {
        if (isOccupied) {
            isOccupied = false;
            System.out.println("Guest checked out.");
        } else {
            System.out.println("com.pluralsight.Room is already empty.");
        }
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    //Method to clean room, sets is dirty to false
    public void cleanRoom() {
        if (!isOccupied) {
            isDirty = false;
            System.out.println("com.pluralsight.Room has been cleaned.");
        } else {
            System.out.println("com.pluralsight.Room cannot be cleaned while it is occupied.");
        }
    }


}
