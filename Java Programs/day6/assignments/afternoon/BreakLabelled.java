package day6.assignments.afternoon;

public class BreakLabelled {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 10; i++) {
            inner: for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.println("-----End-of-Inner------");
                    break inner;
                } else if (i + j > 10) {
                    System.out.println("-----End-of-Outer------");
                    break outer;
                }
                System.out.println(i + " : " + j);
            }
        }
    }

}
