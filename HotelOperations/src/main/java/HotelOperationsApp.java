public class HotelOperationsApp {
    public static void main(String[] args) {
        // Test the Room class
        Room room1 = new Room(2, 129.99, false, false);
        System.out.println("Room is available: " + room1.isAvailable());
        System.out.println("\n");

        // Test the Reservation class
        Reservations reservation = new Reservations("King", 3, true);
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Weekend: " + reservation.isWeekend());
        System.out.println("Price per night: $" + reservation.getPrice());
        System.out.println("Total for reservation: $" + reservation.getTotalPrice());
        System.out.println("\n");

        // Test the employee class
        Employee emp = new Employee("E123", "Jordan Lee", "housekeeping", 20.0, 45.0);
        System.out.println("Employee: " + emp.getName());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Total Pay: $" + emp.getTotalPay());



    }
}
