
public abstract class Employee {

    String name;
    String niNumber;
    double salary;
    String bonus;

    public Employee(String name, String niNumber, double salary, double bonus) {
        this.name = new name;
        this.niNumber = new niNumber;
        this.salary = new salary;
        this.bonus = new bonus;

        public String getName() {
            return name;
        }

        public String getNiNumber() {
            return niNumber;
        }

        public double getSalary() {
            return salary;
        }

        public Double raiseSalary ( double salary){
            if (salary >= 0) {
                this.salary += salary;
            }

            public double Bonus () {
                return this.salary * 0.01;
            }

        }

    }

}


