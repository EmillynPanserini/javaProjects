package ex02;

public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Notebook", "HP", 16, 256);

        computer1.displayComputerType();

        computer1.displayConfigurations();

        Computer computer2 = new Computer("Desktop", "Dell", 32, 1024);

        computer2.displayComputerType();
        computer2.displayConfigurations();
    }
}
