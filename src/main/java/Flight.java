import java.util.ArrayList;

public class Flight {

    ArrayList <Passenger> passengers;
    Plane plane;

    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int returnNoOfAvailableSeats(Plane plane, ArrayList<Passenger> passengers){
        this.plane = plane;
        this.passengers = passengers;
        return (this.plane.getCapacityFromEnum() - this.passengers.size());
    }

    public boolean bookSeat(Plane plane, ArrayList passengers) {
        this.passengers = passengers;
        this.plane = plane;

        if (this.passengers.size() < this.plane.getCapacityFromEnum()) {
            return true;
        }
        return false;
    }

}
