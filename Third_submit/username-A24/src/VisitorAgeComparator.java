import java.util.Comparator;

public class VisitorAgeComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor v1, Visitor v2) {
        return Integer.compare(v1.getAge(), v2.getAge());
    }
}
