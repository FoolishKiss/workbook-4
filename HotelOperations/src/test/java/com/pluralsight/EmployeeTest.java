package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn_shouldSetPunchedInToTrue_whenNotAlreadyPunchedIn() {
        //arrange
        Employee emp = new Employee("1", "Tony Stark", "Tech", 120.0, 0.0);

        //act
        emp.punchIn(9.0);
        emp.punchIn(10.0);
        emp.punchOut(21.0);

        //assert
        assertEquals(12,emp.getHoursWorked());

    }

    @Test
    void punchOut_shouldCalculateWorkedHoursCorrectly() {
        //arrange
        Employee emp = new Employee("2", "Bruce Banner", "Security", 25.0, 0.0);

        //act
        emp.punchIn(9.0);
        emp.punchOut(21.0);

        //assert
        assertEquals(12,emp.getHoursWorked());
    }

    @Test
    void punchOut_shouldAddMultipleShifts() {
        //arrange
        Employee emp = new Employee("3", "Peter Parker", "Janitorial", 19.0, 0.0);

        //act
        emp.punchIn(9.0);
        emp.punchOut(21.0);
        emp.punchIn(10.0);
        emp.punchOut(22.0);

        //assert
        assertEquals(24,emp.getHoursWorked());
    }
}