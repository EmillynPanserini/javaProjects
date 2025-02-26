package Atv001;

public class Main {

    public static void main(String[] args) {
        
        CurrentAccount account1 = new CurrentAccount("123456", 500.0);
        account1.displayInfo();

        System.out.println();

        CurrentAccount account2 = new CurrentAccount("789012");
        account2.displayInfo();

        System.out.println();

        CurrentAccount account3 = new CurrentAccount();
        account3.displayInfo();
    }
}

