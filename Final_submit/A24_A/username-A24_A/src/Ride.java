import java.util.LinkedList;
import java.util.Iterator;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;
    private LinkedList<Visitor> visitorHistory;

    // 默认构造方法
    public Ride() {
        this.visitorHistory = new LinkedList<>();
    }

    // 带参数的构造方法
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this();
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
    }

    // 添加游客到历史记录
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        visitorHistory.add(visitor);
        System.out.println(visitor.getName() + " 已添加到历史记录。");
    }

    // 检查游客是否在历史记录中
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return visitorHistory.contains(visitor);
    }

    // 返回历史记录中的游客数量
    @Override
    public int numberOfVisitors() {
        return visitorHistory.size();
    }

    // 打印历史记录中的游客信息（使用迭代器）
    @Override
    public void printRideHistory() {
        System.out.println("历史记录中的游客：");
        Iterator<Visitor> iterator = visitorHistory.iterator();
        while (iterator.hasNext()) {
            Visitor v = iterator.next();
            System.out.println("- " + v.getName() + " (" + v.getAge() + "岁)");
        }
    }

    // 以下方法暂时未实现
    @Override
    public void addVisitorToQueue(Visitor visitor) {}
    @Override
    public void removeVisitorFromQueue() {}
    @Override
    public void printQueue() {}
    @Override
    public void runOneCycle() {}
}
