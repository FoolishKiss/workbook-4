package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {

    //Variables for employees
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private boolean punchedIn;


    //Constructor
    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = startTime;
        this.punchedIn = false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //Derived getter that returns hours up to 40 as regular time
    public double getRegularHours() {
        return Math.min(40, hoursWorked);
    }

    //Derived getter that returns hours over 40 as overtime
    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    //Derived getter that returns total pay by adding
    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * payRate * 1.5;
    }

    //Method to punch in, takes the current time and clocks in employee
    public void punchIn(double time) {
        if (!punchedIn) {
            startTime = time;
            punchedIn = true;
            System.out.println(name + " punched in at " + time);
        } else {
            System.out.println(name + " is already punched in.");
        }
    }

    //Method to punch out, it calculates the time worked since start time and
    //adds it to total hours and flips punched back to false
    public void punchOut(double time) {
        if (punchedIn) {
            double hours = time - startTime;
            hoursWorked += hours;
            punchedIn = false;
            System.out.println(name + " punched out at " + time + ". Hours worked: " + hours);
        } else {
            System.out.println(name + " is not punched in. ");
        }
    }

    //Method to punch in using local date time
    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchIn(time);  // call the original method and passes time generated
    }

    //Method to punch out using local date time
    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double time = now.getHour() + now.getMinute() / 60.0;
        punchOut(time);  // call the original method
    }


}
