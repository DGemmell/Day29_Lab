
public abstract class Employee {

    String name;
    String niNumber;
    double salary;
    double bonus;

    public Employee(String name, String niNumber, double salary, double bonus) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
        this.bonus = bonus;
    }

        public String getName() {
            return name;
        }

        public String getNiNumber() {
            return niNumber;
        }

        public double getSalary() {
            return salary;
        }

        public void raiseSalary(double salary) {
            if (salary >= 0){
                this.salary += salary;
            }

        }


        public double Bonus(){
                return this.salary * 0.01;}}








