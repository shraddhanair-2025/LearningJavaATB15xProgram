package ex_16_OOPs;

public class LoginPage_ConstructorChaining {

    String email;
    int a;

    public LoginPage_ConstructorChaining() {
        this.email = email;
        System.out.println("DC");
    }

    public LoginPage_ConstructorChaining(String email, String password) {
        this.email = email;
        this.password = password;
    }

    String password;

    public LoginPage_ConstructorChaining(String email, String password, String submitButton) {
        //this.email = email;
        //this.password = password;
        this(email,password);
        this.submitButton = submitButton;
        this.a = a;
    }

    String submitButton;

}
