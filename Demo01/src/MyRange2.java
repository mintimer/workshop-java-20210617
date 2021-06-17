public class MyRange2 {
    private final String input;

    public MyRange2(String input) {
        this.input = input;
    }

    public boolean StartWithInclude() {
        return input.startsWith("[");
    }

    public boolean StartWithExclude() {
        return input.startsWith("(");
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

    public boolean EndWithInclude() {
        return input.endsWith("]");
    }

    public boolean EndWithExclude() {
        return  input.endsWith(")");
    }

    public int getEndNumber() {
        int indexOfComma = input.indexOf(",");
        String stringNum = input.substring(indexOfComma + 1,input.length()-1);
        int endNumber = Integer.parseInt(stringNum);
        if(EndWithInclude()){
            return endNumber;
        }
        return endNumber - 1;
    }
}
