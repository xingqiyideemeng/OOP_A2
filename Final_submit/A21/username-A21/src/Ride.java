public class Ride {
    private String rideName;
    private int capacity;
    private Employee rideOperator;

    // Default constructor
    public Ride() {
    }

    // Construction method with parameters
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
    }

    // Getter and Setter methods
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }
}
