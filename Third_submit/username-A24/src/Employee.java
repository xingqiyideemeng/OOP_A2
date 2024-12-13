// Employee 类：继承自 Person 类，表示主题公园的员工
public class Employee extends Person {
    private String jobTitle; // 员工职位

    // 默认构造函数
    public Employee() {
        super();
        this.jobTitle = "未知职位";
    }

    // 参数化构造函数
    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }

    // 获取职位
    public String getJobTitle() {
        return jobTitle;
    }

    // 设置职位
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
