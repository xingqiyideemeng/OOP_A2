import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class Ride {
    private String rideName; // 游乐设施名称
    private int maxRider; // 每轮最多接待的游客数量
    private int numOfCycles; // 已运行的骑行周期数
    private LinkedList<Visitor> waitingQueue; // 等待队列
    private LinkedList<Visitor> rideHistory; // 游玩历史记录

    // 构造函数
    public Ride(String rideName, int maxRider) {
        this.rideName = rideName;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        this.waitingQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // 添加游客到等待队列
    public void addVisitorToQueue(Visitor visitor) {
        waitingQueue.add(visitor);
        System.out.println("游客 " + visitor.getName() + " 已加入等待队列。");
    }

    // 打印等待队列
    public void printQueue() {
        System.out.println("当前等待队列中的游客：");
        for (Visitor visitor : waitingQueue) {
            System.out.println("- " + visitor.getName());
        }
    }

    // 运行一次骑行周期
    public void runOneCycle() {
        if (waitingQueue.isEmpty()) {
            System.out.println("没有游客在等待队列中，无法运行骑行周期。");
            return;
        }

        System.out.println("开始一次骑行周期...");
        int riders = 0;
        while (!waitingQueue.isEmpty() && riders < maxRider) {
            Visitor visitor = waitingQueue.poll();
            rideHistory.add(visitor); // 添加到历史记录
            System.out.println("游客 " + visitor.getName() + " 正在游玩 " + rideName + "。");
            riders++;
        }

        numOfCycles++; // 骑行周期数加1
        System.out.println("本次骑行周期完成，共接待了 " + riders + " 位游客。");
    }

    // 打印骑行周期的运行次数
    public int getNumOfCycles() {
        return numOfCycles;
    }

    // 打印游玩历史记录
    public void printRideHistory() {
        System.out.println("游玩历史记录：");
        for (Visitor visitor : rideHistory) {
            System.out.println("- 游客: " + visitor.getName() + ", 年龄: " + visitor.getAge());
        }
    }

    // 将历史记录导出到 CSV 文件
    public void exportHistoryToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getTicketType());
                writer.newLine();
            }
            System.out.println("历史记录已导出到文件：" + fileName);
        } catch (IOException e) {
            System.out.println("导出历史记录时发生错误：" + e.getMessage());
        }
    }

    // 从 CSV 文件导入历史记录
    public void importHistoryFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // 按逗号分隔
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String ticketType = data[2];
                Visitor visitor = new Visitor(name, age, ticketType);
                rideHistory.add(visitor); // 添加到历史记录
            }
            System.out.println("历史记录已从文件导入：" + fileName);
        } catch (IOException e) {
            System.out.println("导入历史记录时发生错误：" + e.getMessage());
        }
    }
}
