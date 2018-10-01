import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private Airline airline;
    private ArrayList<Passenger> passengers;



    public Plane(PlaneType planeType, Airline airline) {
        this.planeType = planeType;
        this.airline = airline;
        this.passengers = new ArrayList<>();
    }


    public PlaneType getPlaneType() {
       return this.planeType;
    }

    public Airline getAirline() {
        return this.airline;
    }


    public int numberOfPassengersOnPlane() {
        return this.passengers.size();
    }
}
