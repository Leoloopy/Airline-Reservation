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
}
