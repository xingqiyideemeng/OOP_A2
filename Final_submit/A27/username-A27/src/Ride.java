import java.io.*;
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

    // 从文件导入历史记录
    public void importRideHistory(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // 使用逗号分隔数据
                String[] details = line.split(",");
                if (details.length == 3) {
                    String name = details[0];
                    int age = Integer.parseInt(details[1]);
                    String address = details[2];
                    Visitor visitor = new Visitor(name, age, address);
                    visitorHistory.add(visitor);
                }
            }
            System.out.println("历史记录已从文件导入：" + filePath);
        } catch (IOException e) {
            System.out.println("导入失败：" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("数据格式错误：" + e.getMessage());
        }
    }

    // 打印历史记录
    @Override
    public void printRideHistory() {
        if (visitorHistory.isEmpty()) {
            System.out.println("历史记录为空。");
        } else {
            System.out.println("已参加 " + rideName + " 的游客：");
            for (Visitor v : visitorHistory) {
                System.out.println("- " + v.getName() + " (" + v.getAge() + "岁, " + v.getAddress() + ")");
            }
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

    public void exportRideHistory(String filePath) {
    }

    public void sortRideHistory(VisitorComparator visitorComparator) {
    }
}
