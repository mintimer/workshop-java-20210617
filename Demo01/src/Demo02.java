import java.util.Arrays;

public class Demo02 {
    public static void main(String[] args) {
        String name1 = "somkiat";

        for (int i = 0; i < name1.length(); i++) {
            System.out.println(name1.charAt(i));
        }

        int[] scores = new int[]{0,10,20,30,40};

        for (int score: scores) {
            System.out.println(score);
        }

        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.println(i + " : " + scores[i]);
        }

        Arrays.stream(scores).forEach(System.out::println);
    }
}
