package ex02;

public class Computer {

    private String type;           
    private String brand;          
    private int memoryRAM;         
    private int storage;          

    public Computer(String type, String brand, int memoryRAM, int storage) {
        this.type = type;
        this.brand = brand;
        this.memoryRAM = memoryRAM;
        this.storage = storage;
    }

    public void displayComputerType() {
        System.out.println("Type of the computer: " + type);
    }

    public void displayConfigurations() {
        System.out.println("Brand: " + brand + ", Memory RAM: " + memoryRAM + "GB, Storage: " + storage + "GB");
    }
}
