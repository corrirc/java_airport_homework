import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Ricky", 54321);
    }

    @Test
    public void hasName() {
        assertEquals("Ricky", passenger.getName());
    }

    @Test
    public void hasPassportNumber() {
        assertEquals(54321, passenger.getPassportNumber());
    }
}
