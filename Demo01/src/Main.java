public class Main {
    public static void main(String[] args) {
        String fisrtname = args[0];
        String lastname = args[1];
        Employee somkiat = new Employee(fisrtname,lastname); //Default Constructor

        String result = somkiat.getFullName();
        System.out.println(result);
    }
}
