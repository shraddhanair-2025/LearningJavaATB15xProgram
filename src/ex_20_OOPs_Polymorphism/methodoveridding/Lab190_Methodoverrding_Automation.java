package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        CommanToAll commanToAll = new CommanToAll();
        commanToAll.openBrowser();

        // Dynamic Dispatch
        CommanToAll c2 = new ChromeTC();
        c2.openBrowser();

        CommanToAll c3 = new FirefoxTC();
        c3.openBrowser();
    }
}
class CommanToAll{
    void openBrowser(){
        System.out.println("Starting the IE browser");
    }
}
class ChromeTC extends CommanToAll{
    void openBrowser(){
        System.out.println("Starting the Chrome browser");
    }
}
class FirefoxTC extends CommanToAll{
    void openBrowser(){
        System.out.println("Starting the Firefor browser");
    }
}