import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;
    Passenger passenger1;
    Passenger passenger2;

  @Before
    public void before(){
      plane = new Plane(PlaneType.B737, Airline.RYANAIR);
      passenger1 = new Passenger("Ricky", 54321);
      passenger2 = new Passenger("Davie", 12345);
  }

    @Test
    public void hasPlaneType() {
      assertEquals(PlaneType.B737, plane.getPlaneType());
    }

    @Test
    public void hasAirline() {
      assertEquals(Airline.RYANAIR, plane.getAirline());
    }

    @Test
    public void planeIsEmpty() {
      assertEquals(0, plane.numberOfPassengersOnPlane());
    }

//    @Test
//    public void passengerBoarded() {
//      plane.boardPassenger(passenger1);
//      assertEquals(1, plane.numberOfPassengersOnPlane());
//    }
}
