public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    // Default constructor
    public Visitor() {
        super();
    }

    // Construction method with parameters
    public Visitor(String name, int age, String address, String visitorId, String ticketType) {
        super(name, age, address);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    // Getter and Setter methods
    public String getVisitorId() {
        return visitorId;
    }

    public void setVisitorId(String visitorId) {
        this.visitorId = visitorId;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
