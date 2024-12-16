public class Visitor extends Person {
    private String visitorId;
    private String ticketType;

    // 默认构造方法
    public Visitor() {
        super();
    }

    // 带参数的构造方法
    public Visitor(String name, int age, String address, String visitorId, String ticketType) {
        super(name, age, address);
        this.visitorId = visitorId;
        this.ticketType = ticketType;
    }

    public Visitor(String name, int i, String address) {
        this.setName(name);
        this.setAge(i);
        this.setAddress(address);
    }

    // Getter 和 Setter 方法
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
