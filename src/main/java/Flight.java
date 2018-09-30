public class Flight {

    private Plane plane;
    private String flightNumber;

    public Flight(Plane plane, String flightNumber){
        
        this.plane = plane;
        this.flightNumber = flightNumber;

    }


    public Plane getPlane() {
        return this.plane;
    }

    public String  getFlightNumber() {
        return this.flightNumber;
    }
}
