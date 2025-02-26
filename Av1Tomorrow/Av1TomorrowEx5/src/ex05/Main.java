package ex05;

public class Main {

    public static void main(String[] args) {
        CellPhone phone = new CellPhone("Samsung", "Galaxy S21", 50);

        phone.displayInfo();

        phone.usePhone();
        phone.usePhone();
        phone.usePhone();

        phone.chargePhone();
        phone.chargePhone();
    }
}
