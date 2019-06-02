import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {

    Plane plane;
    Flight flight;
    ArrayList <Passenger> passengers;
    Passenger passenger1;

    @Before
    public void setUp() {
        this.plane = new Plane(PlaneType.BOEING747);
        this.passengers = new ArrayList<Passenger>();
        this.passenger1 = new Passenger("Jack Jarvis", 2);
        this.flight = new Flight(plane, "FR756", "MEX", "GLA", "17:45");
    }

    @Test
    public void canGetPassengers(){
        this.passengers.add(passenger1);
        assertEquals(1, this.passengers.size());
    }

    @Test
    public void getPlane() {
        assertEquals(plane, this.flight.getPlane());
    }

    @Test
    public void getFlightNumber() {
        assertEquals("FR756", this.flight.getFlightNumber());
    }

    @Test
    public void getDestination() {
        assertEquals("MEX", this.flight.getDestination());
    }

    @Test
    public void getDepartureAirport() {
        assertEquals("GLA", this.flight.getDepartureAirport());
    }

    @Test
    public void getDepartureTime() {
        assertEquals("17:45", this.flight.getDepartureTime());
    }

    @Test
    public void canGetAvailableSeats(){
        this.passengers.add(passenger1);
        assertEquals(415, this.flight.returnNoOfAvailableSeats(this.plane, this.passengers));
    }

    @Test
    public void canBookAvailableSeat(){
        assertTrue("true", this.flight.bookSeat(this.plane, this.passengers));
    }

    @Test
    public void cannotBookIfThereAreNoSeatsAvailable(){
        int counter;
        for(counter=0;counter<416;counter++){
            this.passengers.add(passenger1);
        };
        assertFalse("false", this.flight.bookSeat(this.plane, this.passengers));
        System.out.println(this.passengers.size());
    }
}
