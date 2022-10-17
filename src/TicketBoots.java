import java.util.Scanner;

public class TicketBoots {
    private final BookingSection bookingSection = new BookingSection();
    private final Passenger passenger = new Passenger();

    public void bookSeats(){
        bookingSection.bookSeats(passenger, collectInput());
    }

    public int collectInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("""
                Enter Your Seat number
                For Economy Class Booking, input a number between 1 - 5
                For First Class Booking, input a number between 6 - 10
                """);
        return userInput.nextInt();
    }
    public static void main(String[] args) {
       TicketBoots bookingTicketHere = new TicketBoots();
       bookingTicketHere.bookSeats();

    }
}
