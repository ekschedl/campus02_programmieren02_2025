package Icebreaker;

public class Favorite {
    String title;
    Medium medium;
    String comment;

    public Favorite(String title, Medium medium) {
        this.title = title;
        this.medium = medium;
    }

    public Favorite(String title, Medium medium, String comment) {
        this.title = title;
        this.medium = medium;
        this.comment = comment;
    }
}
