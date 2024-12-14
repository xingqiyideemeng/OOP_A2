public class AssignmentTwo {
    public void partSix() {
        // 创建游乐设施
        Ride ride = new Ride("过山车");

        // 向游玩历史添加游客
        ride.addVisitorToHistory(new Visitor("张三", 25, "普通票"));
        ride.addVisitorToHistory(new Visitor("李四", 22, "VIP票"));
        ride.addVisitorToHistory(new Visitor("王五", 30, "普通票"));
        ride.addVisitorToHistory(new Visitor("赵六", 28, "学生票"));
        ride.addVisitorToHistory(new Visitor("孙七", 18, "普通票"));

        // 打印游玩历史记录
        System.out.println("游玩历史记录：");
        ride.printRideHistory();

        // 导出游玩历史记录到文件
        String fileName = "src/ride_history.csv";
        ride.exportRideHistory(fileName);
    }

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partSix();
    }
}
