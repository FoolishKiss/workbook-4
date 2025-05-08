package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    public void checkIn_should_setRoomToOccupiedAndDirty() {
        //arrange
        Room room = new Room(2,124.0,false,false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_shouldNotAllow_ifRoomIsOccupied() {
        //arrange
        Room room = new Room(2,124.0,true,false);

        //act
        room.checkIn();

        //assert
        assertTrue(room.isOccupied());

    }

    @Test
    public void checkout_shouldSetOccupiedToFalse_whenRoomIsOccupied() {
        //arrange
        Room room = new Room(2, 124.0, true, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void checkout_shouldLeaveOccupiedFalse_whenRoomIsAlreadyEmpty() {
        //arrange
        Room room = new Room(2, 124.0, false, true);

        //act
        room.checkOut();

        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom_shouldNotClean_ifRoomIsOccupied() {
        //arrange
        Room room = new Room(2, 124.0, true, true);

        //act
        room.cleanRoom();

        //assert
        assertTrue(room.isDirty());
    }
}