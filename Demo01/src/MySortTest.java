import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void EmptyList(){
        List<Integer> input = new ArrayList<>();
        input.clear();
        MySort mySort = new MySort(input);
        List<Integer> expect = mySort.sortList();
        assertEquals(input,expect);
    }

    @Test
    public void OneValueList(){
        List<Integer> input = new ArrayList<>();
        input.add(1);
        MySort mySort = new MySort(input);
        List<Integer> expect = mySort.sortList();
        assertEquals(input,expect);
    }
}