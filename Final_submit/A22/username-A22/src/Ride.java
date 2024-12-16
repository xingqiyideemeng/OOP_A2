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
        System.out.println("当前等待队列的游客：");
        for (Visitor v : visitorQueue) {
            System.out.println("- " + v.getName());
        }
    }

    // 运行游乐项目一个周期（此处仅示意，未完全实现）
    @Override
    public void runOneCycle() {
        System.out.println("运行游乐项目的一个周期...");
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

    // 打印历史记录中的游客信息
    @Override
    public void printRideHistory() {
        System.out.println("历史记录中的游客：");
        for (Visitor v : visitorHistory) {
            System.out.println("- " + v.getName());
        }
    }
}
