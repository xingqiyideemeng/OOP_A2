import java.util.LinkedList;

public interface RideInterface {
    // 将游客添加到等待队列
    void addVisitorToQueue(Visitor visitor);

    // 从等待队列中移除游客
    Visitor removeVisitorFromQueue();

    // 打印等待队列中的所有游客
    void printQueue();

    // 运行一次游玩循环
    void runOneCycle();

    // 将游客添加到历史记录
    void addVisitorToHistory(Visitor visitor);

    // 检查游客是否已经游玩
    boolean checkVisitorFromHistory(Visitor visitor);

    // 获取所有历史记录中的游客数量
    int numberOfVisitors();

    // 打印游玩记录中的所有游客
    void printRideHistory();
}
