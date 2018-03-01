public class Manager extends Employee {

    private String department_name;

    public Manager(String name, int ni_number, double salary, String department_name) {
        super(name, ni_number, salary);
        this.department_name = department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getName(){
        return super.getName();
    }

    public int getNI_Number(){
        return super.getNI_Number();
    }

    public Double getSalary(){
        return super.getSalary();
    }

    public Double raiseSalary(Double newSalary){
        return super.raiseSalary(); }

    public Double payBonus(Double Bonus) { return super.payBonus(); }
}
