package ex_16_OOPs;

public class LoginPage_constructorOverloading {
String email;

LoginPage_constructorOverloading(){
    System.out.println("DC");
}

    public LoginPage_constructorOverloading(String password) {
        this.password = password;
    }

    String password;

    public LoginPage_constructorOverloading(String email, String password, String submitButton) {
        this.email = email;
        this.password = password;
        this.submitButton = submitButton;
    }

    String submitButton;
}
