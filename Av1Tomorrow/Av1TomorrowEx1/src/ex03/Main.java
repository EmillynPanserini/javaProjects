package ex03;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Inception", 165, "Action");

        movie1.displayInformation();

        movie1.calculateDurationInHours();

        Movie movie2 = new Movie("The Godfather", 175, "Crime");

        movie2.displayInformation();
        movie2.calculateDurationInHours();
    }
}
