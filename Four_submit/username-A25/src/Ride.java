import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Ride {
    private String rideName; // 游乐设施名称
    private LinkedList<Visitor> rideHistory; // 游玩历史记录

    // 构造函数
    public Ride(String rideName) {
        this.rideName = rideName;
        this.rideHistory = new LinkedList<>();
    }

    // 添加游客到游玩历史记录
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("游客 " + visitor.getName() + " 已添加到游玩历史。");
    }

    // 打印游玩历史记录
    public void printRideHistory() {
        System.out.println("游玩历史记录：");
        for (Visitor visitor : rideHistory) {
            System.out.println("- 游客: " + visitor.getName() + ", 年龄: " + visitor.getAge() + ", 门票类型: " + visitor.getTicketType());
        }
    }

    // 导出游玩历史记录到文件
    public void exportRideHistory(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getTicketType());
                writer.newLine();
            }
            System.out.println("游玩历史记录已成功导出到文件：" + fileName);
        } catch (IOException e) {
            System.out.println("导出历史记录时发生错误：" + e.getMessage());
        }
    }
}
