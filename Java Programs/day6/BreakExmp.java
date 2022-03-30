package day6;

public class BreakExmp {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            inner: for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.println("-----------");
                    break inner;
                } else if (i + j > 10) {
                    break outer;
                }
                System.out.println(i + " : " + j);
            }
        }

    }
}
