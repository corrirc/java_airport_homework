import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Plane plane;
    Flight flight;

    @Before
    public void before(){
        plane = new Plane(PlaneType.B737, Airline.RYANAIR);
        flight = new Flight(plane, "FR123");
    }

    @Test
    public void hasPlane() {
        assertEquals(plane, flight.getPlane());
    }

}
