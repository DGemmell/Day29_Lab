public class Manager extends Employee {

    private String departmentName;

    public Manager(String name, String niNumber, double salary, double bonus, String departmentName) {
        super(name, niNumber, salary, bonus);
        this.departmentName = departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName =  departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
