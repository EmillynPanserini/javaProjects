package ex02;

public class Dog extends Animal {
    public String type;          

    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
