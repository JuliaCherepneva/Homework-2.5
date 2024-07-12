package exception;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super("Не соответствует требованиям");
    }
    public WrongPasswordException(String p, String cp) {
        super(String.format("Пароль [%s] не совпадает с [%s]",p, cp));
    }
    public WrongPasswordException(int l) {
        super(String.format("Недопустимая длина: %s", l));
    }

}
