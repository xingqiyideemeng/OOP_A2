public class Employee extends Person {
    private String employeeId;
    private String role;

    // Default constructor
    public Employee() {
        super();
    }

    // Construction method with parameters
    public Employee(String name, int age, String address, String employeeId, String role) {
        super(name, age, address);
        this.employeeId = employeeId;
        this.role = role;
    }

    // Getter and Setter methods
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
