package Icebreaker;


import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private List<Favorite> favorites;

    public Person(String firstName, String lastName, List<Favorite> favorites) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favorites = favorites;
    }

    public String introduceMe() {
        String intro = "My name is " + firstName + " " + lastName + ".";
        if (!favorites.isEmpty()) {
            if (favorites.size() == 1) {
                intro = intro + "\n" + "My favorite thing is ";
            } else {
                intro = intro + "\n" + "My favorite things are:  " + "\n";
            }
            for (Favorite favorite : favorites) {
                intro = intro + " a " + favorite.medium + " called " + favorite.title + ".";
                if (favorite.comment != null) {
                    intro = intro + favorite.comment + "\n";
                }
            }
        }
        return intro;
    }
}
