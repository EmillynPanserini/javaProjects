package ex03;

public class Movie {

    private String title;          
    private int durationInMinutes; 
    private String genre;          

    public Movie(String title, int durationInMinutes, String genre) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.genre = genre;
    }

    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Duration: " + durationInMinutes + " minutes");
        System.out.println("Genre: " + genre);
    }

    public void calculateDurationInHours() {
        int hours = durationInMinutes / 60;
        int minutes = durationInMinutes % 60;
        System.out.println("Duration: " + hours + " hours and " + minutes + " minutes");
    }
}

