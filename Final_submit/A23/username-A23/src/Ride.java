import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;
    private Queue<Visitor> visitorQueue;
    private LinkedList<Visitor> visitorHistory;

    // 默认构造方法
    public Ride() {
        this.visitorQueue = new LinkedList<>();
        this.visitorHistory = new LinkedList<>();
    }

    // 带参数的构造方法
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this();
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
    }

    // 添加游客到队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " 已加入等待队列。");
    }

    // 从队列中移除游客
    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();
            System.out.println(removedVisitor.getName() + " 已被移出队列。");
        } else {
            System.out.println("队列为空，没有游客可移除。");
        }
    }

    // 打印队列中的游客信息
    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("等待队列为空。");
        } else {
            System.out.println("当前等待队列的游客：");
            for (Visitor v : visitorQueue) {
                System.out.println("- " + v.getName());
            }
        }
    }

    // 以下方法暂不实现，仅提供占位
    @Override
    public void runOneCycle() {}
    @Override
    public void addVisitorToHistory(Visitor visitor) {}
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) { return false; }
    @Override
    public int numberOfVisitors() { return 0; }
    @Override
    public void printRideHistory() {}
}
