import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    Airport prestwickAirport;

    @Before
    public void before() {
        prestwickAirport = new Airport("PIK");
    }

    @Test
    public void getAirportCode() {
        assertEquals("PIK", prestwickAirport.getAirportCode());
    }


}
