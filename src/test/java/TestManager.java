import org.junit.Before;
import org.junit.Test;

public class TestManager {
    Manager manager;
    Employee employee;

    @Before
    public void before() {
        manager = new manager
        employee = new Employee("mat jones", "ba4567999", 30000);
    }

    @Test
    public double canGetSalary(){
        assertEquals(30000, employee.getRaiseSalary());
    }

    @Test
    public double canGetBonus(){
        assertEquals(300, employee.getBonus());
    }

}



