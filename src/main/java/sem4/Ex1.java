package sem4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Ex1 {
    private String login;
    private String password;
    private String confirmPassword;

    static void checkLoginPass(String login, String password, String confirmPassword) throws Throwable {

        if (login.length()>20){
            throw new WrongLoginException("Error login");
        }
        if (password.length()>20 ){
            throw new WrongPasswordException("Error password");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Error confirm");
        }
        else {
            System.out.println("Success");
        }
    }
}