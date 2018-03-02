
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestManager {
    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Scott Stevenson","ba4567999", 30000, 3000, "Human Resources");

    }
    @Test
    public void canGetDepartmentName(){
        assertEquals("Human Resources", manager.getDepartmentName());
    }

    @Test
    public void canGetName(){
        assertEquals("Scott Stevenson", manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("ba4567999", manager.getNiNumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(30000.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetBonus(){
        assertEquals(300, manager.Bonus(), 0.01);
    }

}
