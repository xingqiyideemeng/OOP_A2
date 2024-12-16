public interface RideInterface {
    // 添加游客到队列
    void addVisitorToQueue(Visitor visitor);

    // 从队列中移除游客
    void removeVisitorFromQueue();

    // 打印队列中的游客信息
    void printQueue();

    // 运行游乐项目一个周期
    void runOneCycle();

    // 添加游客到历史记录
    void addVisitorToHistory(Visitor visitor);

    // 检查游客是否在历史记录中
    boolean checkVisitorFromHistory(Visitor visitor);

    // 返回历史记录中的游客数量
    int numberOfVisitors();

    // 打印历史记录中的游客信息
    void printRideHistory();
}
