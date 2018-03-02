public class Director extends Manager {

    private Double budget;

    public Director(String name, String niNumber, double salary, double bonus, String department_name) {
        super(name, niNumber, salary, bonus, department_name);
        this.budget = budget;
    }
}
