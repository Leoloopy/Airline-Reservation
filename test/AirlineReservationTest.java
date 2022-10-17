import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirlineReservationTest {
    private BookingSection bookingSection;

    @BeforeEach
    void setUp(){
        bookingSection = new BookingSection();
    }

    @Test
    void testThatPassengersCanBookSeatsInEconomy(){
        Passenger passenger = new Passenger();
        boolean bookingStatus = bookingSection.bookSeats(passenger, 2);
        assertTrue(bookingStatus);
    }

    @Test
    void testThatPassengerCanBookSeatsInFirstClass(){
        Passenger passenger = new Passenger();
        boolean bookingStatus = bookingSection.bookSeats(passenger,  9);
        assertTrue(bookingStatus);
    }

    @Test
    void testThatPassengersCannotBookAnAlreadyBookedSeats(){
        Passenger passenger = new Passenger();

        boolean bookingStatus = bookingSection.bookSeats(passenger, 2);
        assertTrue(bookingStatus);

        boolean secondBookingStatus = bookingSection.bookSeats(passenger, 2);
        assertFalse(secondBookingStatus);
    }

    @Test
    void testThatPassengersCanBookAllEconomySeats(){
       Passenger passenger = new Passenger();

       boolean bookingStatus1 = bookingSection.bookSeats(passenger, 1);
       boolean bookingStatus2 = bookingSection.bookSeats(passenger, 2);
       boolean bookingStatus3 = bookingSection.bookSeats(passenger, 3);
       boolean bookingStatus4 = bookingSection.bookSeats(passenger, 4);
       boolean bookingStatus5 = bookingSection.bookSeats(passenger, 5);

       assertTrue(bookingStatus1);
       assertTrue(bookingStatus2);
       assertTrue(bookingStatus3);
       assertTrue(bookingStatus4);
       assertTrue(bookingStatus5);

       bookingSection.viewBookedSeats();
    }

    @Test
    void testThatPassengerCanBookAllFirstClassSeats(){
        Passenger passenger = new Passenger();

        boolean bookingStatus1 = bookingSection.bookSeats(passenger, 6);
        boolean bookingStatus2 = bookingSection.bookSeats(passenger, 7);
        boolean bookingStatus3 = bookingSection.bookSeats(passenger, 8);
        boolean bookingStatus4 = bookingSection.bookSeats(passenger, 9);
        boolean bookingStatus5 = bookingSection.bookSeats(passenger, 10);

        assertTrue(bookingStatus1);
        assertTrue(bookingStatus2);
        assertTrue(bookingStatus3);
        assertTrue(bookingStatus4);
        assertTrue(bookingStatus5);

        bookingSection.viewBookedSeats();
    }

}
