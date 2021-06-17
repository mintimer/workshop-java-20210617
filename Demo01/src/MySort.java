import java.util.ArrayList;
import java.util.List;

public class MySort {
    private final List<Integer> input;

    public MySort(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> sortList() {
        List<Integer> result = new ArrayList<>();
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < input.size(); i++) {
            int min = Integer.MAX_VALUE;
            for (int num:input) {
                if(num<min && num>temp){
                    min = num;
                }
            }
            result.add(min);
            temp = min;
        }
        return result;
    }
}
