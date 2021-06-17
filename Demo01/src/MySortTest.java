import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MySortTest {

    @Test
    public void EmptyList(){
        List<Integer> input = new ArrayList<>();
        input.clear();
        List<Integer> expect = new ArrayList<>();
        expect.clear();

        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortList();
        assertEquals(expect,result);
    }

    @Test
    public void OneValueList(){
        List<Integer> input = new ArrayList<>();
        input.add(1);
        List<Integer> expect = new ArrayList<>();
        expect.add(1);

        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortList();
        assertEquals(expect,result);
    }

    @Test
    public void TwoValueList01(){
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(2);

        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortList();
        assertEquals(expect,result);
    }

    @Test
    public void TwoValueList02(){
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(1);
        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(2);

        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortList();
        assertEquals(expect,result);
    }

    @Test
    public void ThreeValueList01(){
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        List<Integer> expect = new ArrayList<>();
        expect.add(1);
        expect.add(2);
        expect.add(3);

        MySort mySort = new MySort(input);
        List<Integer> result = mySort.sortList();
        assertEquals(expect,result);
    }
}