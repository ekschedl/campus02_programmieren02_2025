package Gifts;



import java.time.LocalDate;
import java.util.ArrayList;

public class Person {
    private String name;
    private LocalDate birthday;
    private ArrayList<Gift> giftIdeas;
    private ArrayList<Gift> alreadyGifted;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.giftIdeas = new ArrayList<>();
        this.alreadyGifted = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.giftIdeas.add(gift);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Gift> getGiftIdeas() {
        return giftIdeas;
    }

    public void setGiftIdeas(ArrayList<Gift> giftIdeas) {
        this.giftIdeas = giftIdeas;
    }

    public ArrayList<Gift> getAlreadyGifted() {
        return alreadyGifted;
    }

    public void setAlreadyGifted(ArrayList<Gift> alreadyGifted) {
        this.alreadyGifted = alreadyGifted;
    }
}