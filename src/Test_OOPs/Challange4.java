package Test_OOPs;

public class Challange4 {
    public static void main(String[] args) {
 //    Create a BankAccount class with private balance field. Implement deposit(), withdraw(), and getBalance() methods
//      with proper validation.

        BankAccount account = new BankAccount(1000);
         account.deposit(500);
         account.Withdrawl(1500);
         account.Withdrawl(100);
         account.deposit(500);

    }
}
class BankAccount {

    // Private balance field
    private Double balance;

    // Constructor
    public BankAccount(double intitialBalance) {
        if (intitialBalance >= 0){
            balance = intitialBalance;
        }
        else {
            balance = (double)0;
            System.out.println("Initial bal can not be negative. set to 0.");
        }
    }

    // Deposit method
    void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited:"+amount);
        }
        else {
            System.out.println("Deposite amount must be positive");
        }
    }

    // Withdraw method
    void Withdrawl(double amount){
        if (amount <= 0){
            System.out.println("Withdrawl amount must be positive");
        }
        else if (amount > balance){
            System.out.println("Insufficient balance");
        }
        else {
            balance -= amount;
            System.out.println("Withdrawl:" +amount);
        }
    }

    // Get balance method
    public Double getBalance() {
        return balance;
    }
}

