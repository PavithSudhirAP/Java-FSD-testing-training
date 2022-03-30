package day9;

public class ConstructorChaining1 {

    ConstructorChaining1() {
        this(2);
        System.out.println("The default constructor is called!!");
    }

    ConstructorChaining1(int i) {
        this(1, 3);
        System.out.println(i);
    }

    ConstructorChaining1(int i, int j) {
        System.out.println(i * j);
    }

    public static void main(String[] args) {
        new ConstructorChaining1();
    }
}
