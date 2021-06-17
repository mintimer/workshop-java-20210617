public class MyRange {
    public static void main(String[] args) {
        String[] input = args[0].split(",");
        int[] range = new int[]{0,0};

        if(input.length == 2){
            if(input[0].startsWith("[") && input[0].length() > 1){
                String first = input[0].substring(1);
                range[0] = Integer.parseInt(first);
            }
            else if(input[0].startsWith("(") && input[0].length() > 1){
                String first = input[0].substring(1);
                range[0] = Integer.parseInt(first) + 1;
            }
            else{
                System.out.println("Invalid First Input");
                return;
            }

            if(input[1].endsWith("]") && input[1].length() > 1){
                String last = input[1].substring(0,input[1].length()-1);
                range[1] = Integer.parseInt(last);
            }
            else if(input[1].endsWith(")") && input[1].length() > 1){
                String last = input[1].substring(0,input[1].length()-1);;
                range[1] = Integer.parseInt(last) - 1;
            }
            else {
                System.out.println("Invalid Last Input");
                return;
            }

            if(range[1] >= range[0]) {
                for (int i = range[0]; i <= range[1]; i++) {
                    if(i != range[0]) {
                        System.out.print(",");
                    }
                    System.out.print(i);
                }
                System.out.println();
            }
            else {
                System.out.println("Invalid Range");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
