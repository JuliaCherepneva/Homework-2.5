import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InfoServiceImpl implements Service {



    @Override
    public void checkInfo(String login, String password, String confirmPassword) {
        if (login.length() > 20) {
            throw new WrongLoginException(login.length());
        }
        if (password.length() > 20) {
            throw new WrongPasswordException(password.length());
        }
        if (confirmPassword.length() > 20) {
                throw new WrongPasswordException(confirmPassword.length());
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException(password, confirmPassword);
        }
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (!password.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException();
        }
        if (!confirmPassword.matches("[a-zA-Z0-9_]+")) {
            throw new WrongPasswordException();
        }

    }



}
