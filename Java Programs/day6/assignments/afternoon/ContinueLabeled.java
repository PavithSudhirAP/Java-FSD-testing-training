package day6.assignments.afternoon;

public class ContinueLabeled {
    public static void main(String[] args) {

        outer: for (int i = 1; i < 5; i++) {
            inner: for (int j = 1; j < 5; j++) {
                if (i == j) {
                    System.out.println("-----continue inner-----");
                    continue inner;
                } else if (i + j > 5) {
                    System.out.println("-----continue outer-----");
                    continue outer;
                }
                System.out.println(i + " : " + j);
            }
        }
    }
}
