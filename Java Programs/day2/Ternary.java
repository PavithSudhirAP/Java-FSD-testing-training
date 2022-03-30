package day2;

public class Ternary {
    public static void main(String[] args) {
        int a = 200, b = 200;
        int c = (a > b) ? a : (b > a) ? b : 0;
        System.out.println(c);
    }

}
