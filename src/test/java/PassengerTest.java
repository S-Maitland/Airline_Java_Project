import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void setUp(){
        passenger = new Passenger("Jack Jarvis", 1);
    }

    @Test
    public void canGetPassengerName(){
        assertEquals("Jack Jarvis", this.passenger.getName());
    }

    @Test
    public void canGetPassengerBagCount(){
        assertEquals(1 ,this.passenger.getBagCount());
    }

}
