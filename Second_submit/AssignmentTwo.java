public class AssignmentTwo {
    public void partFourA() {
        // 创建游乐设施
        Ride ride = new Ride("激流勇进", 3); // 每轮最多接待3位游客

        // 创建游客
        Visitor visitor1 = new Visitor("张三", 25, "普通票");
        Visitor visitor2 = new Visitor("李四", 22, "VIP票");
        Visitor visitor3 = new Visitor("王五", 30, "普通票");
        Visitor visitor4 = new Visitor("赵六", 28, "VIP票");
        Visitor visitor5 = new Visitor("孙七", 18, "学生票");

        // 将游客添加到游玩历史记录
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // 打印游玩历史记录
        System.out.println("=== 游玩历史记录 ===");
        ride.printRideHistory();

        // 检查特定游客是否在历史记录中
        System.out.println("李四是否已游玩：" + ride.checkVisitorFromHistory(visitor2));

        // 打印历史记录中的游客总数
        System.out.println("总游客数量：" + ride.numberOfVisitors());
    }

    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
        assignmentTwo.partFourA();
    }
}
