package day6.assignments.afternoon;

public class ContinueUnlabeled {
    public static void main(String[] args) {
        String s = "rabbits run really rapidly.";

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (a == 'r') {
                continue;
            }
            System.out.print(a);
        }
    }
}
