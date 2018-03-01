public class Director extends Manager {

    private Double budget;

    public Director(String name, int ni_number, double salary, String department_name, Double budget) {
        super(name, ni_number, salary, department_name);
        this.budget = budget;
    }
}
