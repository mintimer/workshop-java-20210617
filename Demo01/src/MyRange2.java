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

    public int getStartNumber() {
        int indexOfComma = input.indexOf(",");
        String stringNum = input.substring(1,indexOfComma);
        int startNumber = Integer.parseInt(stringNum);
        if(StartWithInclude()){
            return startNumber;
        }
        return startNumber + 1;
    }
}
