import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;


  @Before
    public void before(){
      plane = new Plane(PlaneType.B737, Airline.RYANAIR);
  }

    @Test
    public void hasPlaneType() {
      assertEquals(PlaneType.B737, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
      assertEquals(Airline.RYANAIR, plane.getAirline());
    }
}
