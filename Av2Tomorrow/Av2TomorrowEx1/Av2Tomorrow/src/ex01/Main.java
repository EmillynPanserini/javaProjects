package ex01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Alice");
        person.setAge(30);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempting to set a negative age
        person.setAge(-5); // This should trigger a message
    }
}

