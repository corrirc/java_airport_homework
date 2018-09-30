import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private Airline airline;



    public Plane(PlaneType planeType, Airline airline) {
        this.planeType = planeType;
        this.airline = airline;

    }


    public PlaneType getPlaneType() {
       return this.planeType;
    }

    public Airline getAirline() {
        return this.airline;
    }




}
