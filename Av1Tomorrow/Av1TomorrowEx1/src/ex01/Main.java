package ex01;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Displaying initial account information
        account.displayInfo();

        account.deposit(500.0);

        // Trying to withdraw more than the balance
        account.withdraw(2000.0);

        // Withdrawing a valid amount
        account.withdraw(400.0);

        // Displaying updated account information
        account.displayInfo();
    }
}
