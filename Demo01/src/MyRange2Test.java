import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRange2Test {

    @Test
    public void StartWithInclude() {
        MyRange2 myRange2 = new MyRange2("[1,5]");
        boolean isInclude = myRange2.StartWithInclude();
        assertTrue(isInclude);
    }

    @Test
    public void StartWithExclude() {
        MyRange2 myRange2 = new MyRange2("(1,5]");
        boolean isExclude = myRange2.StartWithExclude();
        assertTrue(isExclude);
    }

    @Test
    public void StartNumberWithInclude() {
        MyRange2 myRange2 = new MyRange2("[1,5]");
        int startNumber = myRange2.getStartNumber();
        assertEquals(1,startNumber);
    }

    @Test
    public void StartNumberWithExclude() {
        MyRange2 myRange2 = new MyRange2("(10,5]");
        int startNumber = myRange2.getStartNumber();
        assertEquals(11,startNumber);
    }
}