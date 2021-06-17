import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย DefaultConstruction " +
            "จะต้องได้ Fullname = ' : '")
    public void case01(){
        String expectedResult = " : ";
        Employee demo = new Employee(); //Default Constructor
        String actualResult = demo.getFullName();
        //assert or check
        assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("เมื่อทำการสร้าง Employee ด้วย somkiat pui " +
        "จะต้องได้ Fullname = 'somkiat : pui'")
    public void case02(){
        String expectedResult = "somkiat : pui";
        Employee demo = new Employee("somkiat", "pui"); //Default Constructor
        String actualResult = demo.getFullName();
        //assert or check
        assertEquals(expectedResult, actualResult);
    }
}