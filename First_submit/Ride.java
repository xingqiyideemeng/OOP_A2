import java.util.LinkedList;

public class Ride implements RideInterface {
    private String rideName; // 游乐设施名称
    private int maxVisitorsPerCycle; // 每轮最多游玩的游客数量
    private LinkedList<Visitor> waitingQueue; // 等待队列
    private LinkedList<Visitor> rideHistory; // 游玩历史记录

    // 构造函数
    public Ride(String rideName, int maxVisitorsPerCycle) {
        this.rideName = rideName;
        this.maxVisitorsPerCycle = maxVisitorsPerCycle;
        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 实现接口方法：将游客添加到等待队列
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        waitingQueue.add(visitor);
        System.out.println("游客 " + visitor.getName() + " 已加入等待队列。");
    }

    // 实现接口方法：从等待队列中移除游客
    @Override
    public Visitor removeVisitorFromQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("等待队列为空！");
            return null;
        }
        Visitor removedVisitor = waitingQueue.poll();
        System.out.println("游客 " + removedVisitor.getName() + " 已从等待队列中移除。");
        return removedVisitor;
    }

    // 实现接口方法：打印等待队列中的游客
    @Override
    public void printQueue() {
        System.out.println("当前等待队列中的游客：");
        for (Visitor visitor : waitingQueue) {
            System.out.println("- " + visitor.getName());
        }
    }

    // 实现接口方法：运行一次游玩循环
    @Override
    public void runOneCycle() {
        int count = 0;
        System.out.println("开始一次游玩循环...");
        while (!waitingQueue.isEmpty() && count < maxVisitorsPerCycle) {
            Visitor visitor = waitingQueue.poll();
            addVisitorToHistory(visitor);
            System.out.println("游客 " + visitor.getName() + " 正在游玩 " + rideName + "。");
            count++;
        }
        if (count == 0) {
            System.out.println("没有游客参与此次游玩循环。");
        }
    }

    // 实现接口方法：将游客添加到历史记录
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("游客 " + visitor.getName() + " 已记录在游玩历史中。");
    }

    // 实现接口方法：检查游客是否在游玩历史中
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    // 实现接口方法：获取历史记录中的游客数量
    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    // 实现接口方法：打印游玩历史记录
    @Override
    public void printRideHistory() {
        System.out.println("游玩历史记录：");
        for (Visitor visitor : rideHistory) {
            System.out.println("- " + visitor.getName());
        }
    }
}
