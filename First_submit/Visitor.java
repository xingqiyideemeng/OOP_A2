// Visitor 类：继承自 Person 类，表示主题公园的游客
public class Visitor extends Person {
    private String ticketType; // 游客的门票类型

    // 默认构造函数
    public Visitor() {
        super();
        this.ticketType = "普通票";
    }

    // 参数化构造函数
    public Visitor(String name, int age, String ticketType) {
        super(name, age);
        this.ticketType = ticketType;
    }

    // 获取门票类型
    public String getTicketType() {
        return ticketType;
    }

    // 设置门票类型
    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }
}
