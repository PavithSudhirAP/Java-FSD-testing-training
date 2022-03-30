package day6.assignments.afternoon;

public class BreakUnlabeled {
    public static void main(String[] args) {
        String s = "Hello world. This is an example for break";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == '.') {
                break;
            }
            System.out.print(a);
        }

    }
}
