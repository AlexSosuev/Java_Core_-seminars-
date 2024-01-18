package sem4.Var1Class;

import sem4.Var1Class.Ex1;
import sem4.Var1Class.WrongLoginException;
import sem4.Var1Class.WrongPasswordException;

public class Main {
    public static void main(String[] args) throws Throwable {
        try {
            // Ex1.checkLoginPass("admin","123","123");
            Ex1.checkLoginPass("admin1124124124124124124124124124124124","123","123");
        }
        catch (WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
        }
    }
}