public class AssignmentTwo {
    public static void main(String[] args) {
        // 创建游乐设施
        Ride ride = new Ride("过山车", 3);

        // 添加游客到等待队列
        ride.addVisitorToQueue(new Visitor("张三", 25, "普通票"));
        ride.addVisitorToQueue(new Visitor("李四", 22, "VIP票"));
        ride.addVisitorToQueue(new Visitor("王五", 30, "普通票"));
        ride.addVisitorToQueue(new Visitor("赵六", 28, "学生票"));

        // 打印当前等待队列
        ride.printQueue();

        // 运行一次骑行周期
        ride.runOneCycle();

        // 打印游玩历史记录
        ride.printRideHistory();

        // 导出历史记录到文件
        ride.exportHistoryToFile("ride_history.csv");

        // 清空历史记录并从文件导入
        System.out.println("清空历史记录后从文件导入：");
        ride.importHistoryFromFile("ride_history.csv");
        ride.printRideHistory();
    }
}
