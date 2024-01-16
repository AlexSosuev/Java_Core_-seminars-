package sem4;

public class Ex1 {
    private String login;
    private String password;
    private String confirmPassword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public Ex1(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

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