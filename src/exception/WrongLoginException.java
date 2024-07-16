package exception;

public class WrongLoginException extends RuntimeException{
    public WrongLoginException() {
        super("Не соответствует требованиям");
    }
    public WrongLoginException(int l) {
        super(String.format("Недопустимая длина: %s", l) );
    }
    // "Недопустимая длина: " + l
}
