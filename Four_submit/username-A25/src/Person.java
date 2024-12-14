// Person 类：表示一个普通的人
public class Person {
    private String name; // 姓名
    private int age; // 年龄

    // 默认构造函数
    public Person() {
        this.name = "未知";
        this.age = 0;
    }

    // 参数化构造函数
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 设置姓名
    public void setName(String name) {
        this.name = name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }
}
