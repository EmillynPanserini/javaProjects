package ex05;

public class CellPhone {

    private String brand;        
    private String model;        
    private int batteryLevel;    

    public CellPhone(String brand, String model, int batteryLevel) {
        this.brand = brand;
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // Method to use the phone, reducing battery by 10%
    public void usePhone() {
        if (batteryLevel > 0) {
            batteryLevel -= 10;
            if (batteryLevel < 0) {
                batteryLevel = 0;  // Ensures battery doesn't go below 0%
            }
            System.out.println("Used phone. Battery level is now: " + batteryLevel + "%");
        } else {
            System.out.println("Battery is dead. Please charge the phone.");
        }
    }

    // Method to charge the phone, increasing battery by 10%
    public void chargePhone() {
        if (batteryLevel < 100) {
            batteryLevel += 10;
            if (batteryLevel > 100) {
                batteryLevel = 100;  // Ensures battery doesn't exceed 100%
            }
            System.out.println("Charged phone. Battery level is now: " + batteryLevel + "%");
        } else {
            System.out.println("Battery is already fully charged.");
        }
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
