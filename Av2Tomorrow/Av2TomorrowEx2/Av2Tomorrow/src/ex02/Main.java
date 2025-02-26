package ex02;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        
        // Setting values for the attributes
        dog.name = "Buddy";
        dog.age = 5;              // Accessing protected attribute within subclass
        dog.type = "Golden Retriever";

        // Displaying the dog's information and making a sound
        System.out.println("Dog's Name: " + dog.name);
        System.out.println("Dog's Age: " + dog.age);
        System.out.println("Dog's Type: " + dog.type);
        dog.makeSound();          // Calling the overridden method
    }
}
