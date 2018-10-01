import java.util.ArrayList;

public class Airport {

    private String airportCode;
    private ArrayList<Plane> hangars;


    public Airport(String airportCode) {
        this.airportCode = airportCode;
        this.hangars = hangars;
    }


    public String getAirportCode() {
        return this.airportCode;
    }

    public int planeCount(Plane plane) {
        return this.hangars.size();
    }

}
