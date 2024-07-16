import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.Scanner;

public class Main {



    public static void main (String[] args) {
        InfoServiceImpl info = new InfoServiceImpl();
        try {
            info.checkInfo("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException l) {
            System.err.println(l.getMessage());
            l.printStackTrace();
        } catch (WrongPasswordException p) {
            System.err.println(p.getMessage());
        } finally {
            System.out.println("Логин и пароль корректен");
        }

    }

}


