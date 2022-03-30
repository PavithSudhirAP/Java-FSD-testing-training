package day1;

public class DataTypes {

    static int inst = 10; // Instance Variable

    public static void sample() {
        System.out.println(inst);
    }

    public static void main(String[] args) {
        int a = 56;
        System.out.println(a);
        char c = 'z';
        System.out.println(c);
        boolean temp = true;
        System.out.println(temp);
        String s = "Example"; // non-primitive
        System.out.println(s);

        sample();
    }
}
