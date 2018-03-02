
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Scott Stevenson","ba4567999", 30000, "Human Resources");

    }
    @Test
    public void canGetDepartmentName(){
        assertEquals("Human Resources", manager.getDepartment_name());
    }

    @Test
    public void canGetName(){
        assertEquals("Scott Stevenson", manager.getName());
    }

    @Test
    public void canGetNi_number(){
        assertEquals("ba4567999", manager.getNI_Number());
    }

    @Test
    public double canGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public double canGetBonus(){
        assertEquals(300, manager.getBonus(), 0.01);
    }

}
