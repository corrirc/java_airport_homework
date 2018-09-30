public class Passenger {

    private String name;
    private int passportnum;

    public Passenger(String name, int passportnum) {
        this.name = name;
        this.passportnum = passportnum;
    }

    public String getName() {
        return this.name;
    }

    public int getPassportNumber() {
        return this.passportnum;
    }
}
