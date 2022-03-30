package day11;

class NewExceptionByMe extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NewExceptionByMe(String s) {
        super(s);
    }
}

public class ExceptionUserDefined {
    public static void main(String[] args) {
        System.out.println("------Start------");
        try {
            throw new NewExceptionByMe("This is a user-defined exception");
        } catch (NewExceptionByMe e) {
            System.out.println("Caught the exception\n" + e);
        }
        System.out.println("------End------");
    }
}
