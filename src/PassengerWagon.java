import java.util.HashMap;
import java.util.Map;

public class PassengerWagon extends Wagon {
    private Map<Integer, Customer> reservations;

    public PassengerWagon() {
        this.reservations = new HashMap<>(); // ça c'est important !
    }

    public Map<Integer, Customer> getReservations() {
        return reservations;
    }

    public void setReservations(Map<Integer, Customer> reservations) {
        this.reservations = reservations;
    }
}
