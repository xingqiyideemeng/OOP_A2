import java.util.LinkedList;

public class Ride {
    private String rideName; // 游乐设施名称
    private int maxVisitorsPerCycle; // 每轮最多接待的游客数量
    private LinkedList<Visitor> waitingQueue; // 等待队列
    private LinkedList<Visitor> rideHistory; // 游玩历史记录

    // 构造函数
    public Ride(String rideName, int maxVisitorsPerCycle) {
        this.rideName = rideName;
        this.maxVisitorsPerCycle = maxVisitorsPerCycle;
        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 将游客添加到游玩历史记录
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("游客 " + visitor.getName() + " 已记录到游玩历史中。");
    }

    // 检查游客是否在历史记录中
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    // 返回历史记录中的游客数量
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    // 打印游玩历史记录中的游客信息
    public void printRideHistory() {
        System.out.println("游玩历史记录：");
        for (Visitor visitor : rideHistory) {
            System.out.println("- 游客: " + visitor.getName() + ", 年龄: " + visitor.getAge());
        }
    }

    // ... 其他方法 (addVisitorToQueue, removeVisitorFromQueue, etc.)
}
