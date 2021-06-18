package tech.kbtg.a;

public class Demo {

    public static int count = 20;

    //Constant
    public static final int XYZ = 2;

    public static void main(String[] args) {
        System.out.println("Before : " + count);
        Other other = new Other();
        other.todo();
        Other other2 = new Other();
        other2.todo();
        System.out.println("After : " + count);
    }
}

class Other{
    void todo() {
        Demo.count = 10;
    }
}