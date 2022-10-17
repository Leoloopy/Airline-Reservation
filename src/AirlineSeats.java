import java.util.Arrays;
import java.util.stream.IntStream;

public class AirlineSeats {
    private final boolean[] airSeats;

    public AirlineSeats(){
        airSeats = new boolean[10];
    }

    public void viewSeats(){
        for(Boolean b : airSeats) System.out.print(b + " ");
    }

    public boolean[] getSeats() {
        return this.airSeats;
    }
}
