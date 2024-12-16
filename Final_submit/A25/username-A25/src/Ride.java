import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private Employee rideOperator;
    private Queue<Visitor> visitorQueue;
    private LinkedList<Visitor> visitorHistory;
    private int maxRider;    // 一个周期中最大可容纳的游客数
    private int numOfCycles; // 已运行的周期数

    // 默认构造方法
    public Ride() {
        this.visitorQueue = new LinkedList<>();
        this.visitorHistory = new LinkedList<>();
        this.numOfCycles = 0;
    }

    // 带参数的构造方法
    public Ride(String rideName, int capacity, Employee rideOperator, int maxRider) {
        this();
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
        this.maxRider = maxRider;
    }

    // 运行游乐项目一个周期
    @Override
    public void runOneCycle() {
        if (rideOperator == null) {
            System.out.println("错误：没有操作员分配给 " + rideName + "，无法运行。");
            return;
        }

        if (visitorQueue.isEmpty()) {
            System.out.println("错误：等待队列为空，无法运行 " + rideName + "。");
            return;
        }

        System.out.println("\n=== 正在运行 " + rideName + " 的一个周期 ===");
        int ridersTaken = 0;

        // 根据 maxRider 移除游客并添加到历史记录
        while (!visitorQueue.isEmpty() && ridersTaken < maxRider) {
            Visitor visitor = visitorQueue.poll();
            visitorHistory.add(visitor);
            System.out.println(visitor.getName() + " 参加了 " + rideName + "。");
            ridersTaken++;
        }

        numOfCycles++;
        System.out.println("已完成 " + rideName + " 的第 " + numOfCycles + " 个周期，" + ridersTaken + " 位游客参加了游乐项目。\n");
    }

    // 添加游客到队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " 已加入等待队列。");
    }

    // 打印队列中的游客
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

    // 打印历史记录中的游客
    @Override
    public void printRideHistory() {
        if (visitorHistory.isEmpty()) {
            System.out.println("历史记录为空。");
        } else {
            System.out.println("已参加 " + rideName + " 的游客：");
            for (Visitor v : visitorHistory) {
                System.out.println("- " + v.getName());
            }
        }
    }

    // 以下方法暂时未实现
    @Override
    public void removeVisitorFromQueue() {}
    @Override
    public void addVisitorToHistory(Visitor visitor) {}
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) { return false; }
    @Override
    public int numberOfVisitors() { return 0; }

    public void sortRideHistory(VisitorComparator visitorComparator) {
    }
}
