public class Visitor {
    private String name; // 游客姓名
    private int age; // 游客年龄
    private String ticketType; // 门票类型

    // 构造函数
    public Visitor(String name, int age, String ticketType) {
        this.name = name;
        this.age = age;
        this.ticketType = ticketType;
    }

    // Getter 方法
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTicketType() {
        return ticketType;
    }
}
