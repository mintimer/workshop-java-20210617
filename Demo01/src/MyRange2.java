public class MyRange2 {
    private final String input;

    public MyRange2(String input) {
        this.input = input;
    }

    public boolean StartWithInclude() {
        return input.charAt(0) == '[';
    }

    public boolean StartWithExclude() {
        return input.charAt(0) == '(';
    }
}
