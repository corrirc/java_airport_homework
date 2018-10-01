import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport prestwickAirport;
    Plane britishAirways1;
    Plane britishAirways2;


    @Before
    public void before() {
        prestwickAirport = new Airport("PIK");
        britishAirways1 = new Plane(PlaneType.A320, Airline.BRITISH_AIRWAYS);
        britishAirways1 = new Plane(PlaneType.A380, Airline.BRITISH_AIRWAYS);
//        prestwickAirport.addPlaneToHangar(britishAirways1);
//        prestwickAirport.addPlaneToHangar(britishAirways2);
    }

    @Test
    public void getAirportCode() {
        assertEquals("PIK", prestwickAirport.getAirportCode());
    }
//
//    @Test
//    public void planesInHangar() {
//        assertEquals(2, prestwickAirport.planeCount(addPlaneToHangar));
//    }
}
