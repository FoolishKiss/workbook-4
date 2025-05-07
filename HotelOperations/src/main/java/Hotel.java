public class Hotel {

    //Hotel variables
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    //Constructor set the booked counts to 0
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this(name, numberOfSuites, numberOfRooms, 0, 0);
    }

    //Constructor sets all values
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Derived getter to get available suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    //Derived getter to get available suites
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    //Method to book rooms. it takes rooms requested, and checks to see if is suite is true or false for basic room
    public boolean bookRoom(int roomsRequested, boolean isSuite) {

        //If is suite is true then checks
        if (isSuite) {
            //If rooms requested is less than or equal too available suites then increase booked suites by rooms requested
            if (roomsRequested <= (numberOfSuites - bookedSuites)) {
                bookedSuites += roomsRequested;
            }
        } else {
            //If rooms requested is less than or equal too available basic rooms then increase booked basic rooms by rooms requested
            if (roomsRequested <= (numberOfRooms - bookedBasicRooms)) {
                bookedBasicRooms += roomsRequested;

            }
        }
        return false;
    }

}
