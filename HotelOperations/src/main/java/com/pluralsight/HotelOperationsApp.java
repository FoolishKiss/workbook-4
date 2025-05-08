package com.pluralsight;

public class HotelOperationsApp {
    public static void main(String[] args) throws InterruptedException {
        // Test the com.pluralsight.Room class
        Room room = new Room(2, 129.99, true, true);
        System.out.println("Room1 is available: " + room.isAvailable());
        System.out.println("\n");

        Room room1 = new Room(2, 150.0, false, false);
        room1.checkIn();
        room1.checkOut();
        room1.cleanRoom();
        System.out.println("\n");

        // Test the Reservation class
        Reservations reservation = new Reservations("King", 3, true);
        System.out.println("com.pluralsight.Room Type: " + reservation.getRoomType());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total for reservation: $" + reservation.getTotalPrice());
        System.out.println("\n");

        // Test the employee class
        Employee emp = new Employee("1", "Bruce Lee", "housekeeping", 20.0, 45.0);
        System.out.println("com.pluralsight.Employee: " + emp.getName());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());
        System.out.println("\n");

        Employee emp1 = new Employee("2", "Miles Morales", "Front Desk", 20.0, 0.0);
        emp1.punchIn(9.0);
        emp1.punchOut(17.0);
        System.out.println("\n");

        System.out.println("Regular hours: " + emp1.getRegularHours());
        System.out.println("Overtime hours: " + emp1.getOvertimeHours());
        System.out.println("Total pay: $" + emp1.getTotalPay());
        System.out.println("\n");

        Employee emp2 = new Employee("3", "Bruce Wayne", "Housekeeping", 19.75, 0.0);
        emp2.punchIn();   // uses system time
        emp2.punchOut();  // uses system time
        System.out.println("Total hours: " + emp2.getHoursWorked());
        System.out.println("\n");

        //test hotel class
        Hotel hotel = new Hotel("Sunset Resort", 10, 20);
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        hotel.bookRoom(2, true);
        hotel.bookRoom(5, false);
        System.out.println("Available Suites: " + hotel.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel.getAvailableRooms());
        System.out.println("\n");

        Hotel hotel1 = new Hotel("Sunny Days Inn", 10, 20, 5, 5);
        System.out.println("Available Suites: " + hotel1.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel1.getAvailableRooms());
        hotel1.bookRoom(6, true);
        hotel1.bookRoom(5, false);
        System.out.println("Available Suites: " + hotel1.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel1.getAvailableRooms());





    }
}
