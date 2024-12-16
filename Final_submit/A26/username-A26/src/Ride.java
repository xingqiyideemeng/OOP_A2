import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Ride implements RideInterface {
    private String rideName;
    private int capacity;
    private LinkedList<Visitor> visitorHistory;

    // 构造方法
    public Ride(String rideName, int capacity) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.visitorHistory = new LinkedList<>();
    }

    public Ride() {

    }

    // 添加游客到历史记录
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        visitorHistory.add(visitor);
        System.out.println(visitor.getName() + " 已添加到历史记录。");
    }

    // 将历史记录导出到文件
    public void exportRideHistory(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (Visitor visitor : visitorHistory) {
                // 每行写入一个游客的信息，使用逗号分隔
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getAddress());
                writer.newLine();
            }
            System.out.println("历史记录已导出到文件：" + filePath);
        } catch (IOException e) {
            System.out.println("导出失败：" + e.getMessage());
        }
    }

    // 打印历史记录
    @Override
    public void printRideHistory() {
        System.out.println("已参加 " + rideName + " 的游客：");
        for (Visitor v : visitorHistory) {
            System.out.println("- " + v.getName() + " (" + v.getAge() + "岁, " + v.getAddress() + ")");
        }
    }

    // 未实现的方法（占位）
    @Override
    public void addVisitorToQueue(Visitor visitor) {}
    @Override
    public void removeVisitorFromQueue() {}
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) { return false; }
    @Override
    public int numberOfVisitors() { return visitorHistory.size(); }
    @Override
    public void printQueue() {}
    @Override
    public void runOneCycle() {}

    public void sortRideHistory(VisitorComparator visitorComparator) {
    }
}
