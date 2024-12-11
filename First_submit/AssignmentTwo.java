public class AssignmentTwo {
    public static void main(String[] args) {
        // 创建游乐设施
        Ride rollerCoaster = new Ride("过山车", 2); // 每轮最多接待2位游客

        // 创建游客
        Visitor visitor1 = new Visitor("张三", 25, "普通票");
        Visitor visitor2 = new Visitor("李四", 22, "VIP票");
        Visitor visitor3 = new Visitor("王五", 30, "普通票");
        Visitor visitor4 = new Visitor("赵六", 28, "VIP票");

        // 添加游客到等待队列
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);

        // 打印当前队列
        rollerCoaster.printQueue();

        // 运行一次游玩循环
        rollerCoaster.runOneCycle();

        // 打印游玩历史记录
        rollerCoaster.printRideHistory();

        // 再次打印等待队列
        rollerCoaster.printQueue();

        // 检查某位游客是否已经游玩
        System.out.println("游客李四是否已游玩：" + rollerCoaster.checkVisitorFromHistory(visitor2));

        // 获取总游玩游客数
        System.out.println("总游玩游客数：" + rollerCoaster.numberOfVisitors());
    }
}
