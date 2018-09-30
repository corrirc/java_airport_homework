public enum PlaneType {
    B737(100),
    B747(200),
    A320(100),
    A380(500);

    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getPlaneValue() {
        return value;
    }

}

