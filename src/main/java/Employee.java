
public abstract class Employee {

    String name;
    int ni_number;
    double salary;
    String bonus;

    public Employee (String name, String ni_number, double salary, double bonus){
        this.name = new name;
        this.ni_number = new ni_number;
        this.salary = new salary;
        this.bonus = new bonus;

    public String getName(){
        return name;
    }

    public String getNi_number(){
        return ni_number;
    }

    public double getSalary(){
        return salary;
    }

    public Double raiseSalary(double salary){
        if (salary >= 0){
            this.salary += salary;
    }

    public double Bonus){
        return this.salary() * 0.01; }

}

    public int getBonus() {
        return bonus();
    }
}


