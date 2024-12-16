import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        // 首先按姓名排序，如果姓名相同则按年龄排序
        int nameComparison = v1.getName().compareTo(v2.getName());
        if (nameComparison != 0) {
            return nameComparison;
        }
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}
