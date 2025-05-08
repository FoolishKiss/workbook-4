package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {


    @Test
    public void bookRoom_should_increaseBookedSuites() {
        //arrange
        Hotel theHotel = new Hotel("com.pluralsight.Hotel No Tell", 20, 50);


        //act
        theHotel.bookRoom(10, true);


        //assert
        assertEquals(10, theHotel.getAvailableSuites());
    }

    @Test
    public void bookRoom_should_returnFalseIfNoSuitesAvailable() {

        //arrange
        Hotel theHotel = new Hotel("com.pluralsight.Hotel No Tell", 20, 50);


        //act
        boolean success = theHotel.bookRoom(21, true);


        //assert
        assertFalse(success);

    }

}