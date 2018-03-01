import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestEmployee {
    Manager manager;
    Employee employee;

    @Before
    public void before() {
        manager = new Manager();
        employee = new Employee("mat jones", "ba4567999", 30000);
    }

    @Test
    public void canGetName(){
        assertEquals("mat jones", employee.getName());
    }

    @Test
    public void canGetNi_number(){
        assertEquals(ba4567999, employee.getNi_number());
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
