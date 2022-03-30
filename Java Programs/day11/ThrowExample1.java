package day11;

import java.lang.invoke.StringConcatException;

public class ThrowExample1 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("-------NUll POINTER EXCEPTION-------");
        } catch (NullPointerException e) {
            System.out.println(e);
            try {
                throw new ArithmeticException("-------Arithmatic Exception-------");
            } catch (ArithmeticException f) {
                System.out.println(f);
                try {
                    throw new StringConcatException("-------Other Exceptions-------");
                } catch (StringConcatException g) {
                    System.out.println(g);
                }
            }
        }
    }
}
