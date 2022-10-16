public class BookingSection {
    private final AirlineSeats airlineSeats = new AirlineSeats();

    public  boolean bookSeats(Passenger passenger, int seatClass) {
        var planeSeats = airlineSeats.getSeats();
        if (checkForDoubleBookedSeats(seatClass)) return false;
        setSeats(seatClass, planeSeats);
        return seatBookStatusReport(seatClass);
    }

    private boolean checkForDoubleBookedSeats(int seatClass) {
        if (seatBookStatusReport(seatClass)) {
            System.out.printf("Kindly book another seats, Seat %d has been booked!", seatClass);
            return true;
        }
        return false;
    }

    private boolean seatBookStatusReport(int checkSeat) {
        var planeSeats = airlineSeats.getSeats();
        for (int i = 0; i < planeSeats.length; i++) {
            if(planeSeats[checkSeat]) return true;
        }
        return false;
    }

    private void setSeats(int seatClass, boolean[] planeSeats) {
        if (seatClass > 0 && seatClass < 6) {
            planeSeats[seatClass] = true;
            System.out.printf("You have  successfully booked a seat at %d in economy class%n", seatClass);
        }
        if (seatClass >= 6 && seatClass <= 10){
            planeSeats[seatClass] = true;
            System.out.printf("You have  successfully booked a seat at %d in first class%n", seatClass);
        }
    }
}
