package Books____Array;



import java.util.ArrayList;
import java.util.List;

public class ReadingTracker {
    public static void main(String[] args) {
        List<Book> toBeRead = new ArrayList<Book>();
        List<Book> alreadyRead = new ArrayList<Book>();

        Book book1 = new Book("Herr der Ringe 1", "JRR Tolkien", "alsk");
        Book book2 = new Book("Herr der Ringe 2", "JRR Tolkien", "alsk2");
        Book book3 = new Book("Herr der Ringe 3", "JRR Tolkien", "alsk3");
        Book book4 = new Book("Der Hobbit", "JRR Tolkien", "alsk4");
        Book book5 = new Book("Silmarillion", "JRR Tolkien", "alsk5");

        alreadyRead.add(book4);

        toBeRead.add(book1);
        toBeRead.add(book2);
        toBeRead.add(book3);
        toBeRead.add(book5);

        showList(alreadyRead);
        System.out.println("-----------");
        showList(toBeRead);

        read(book1, toBeRead, alreadyRead);
        System.out.println("-----------");

        showList(alreadyRead);
        System.out.println("-----------");
        showList(toBeRead);
    }
    public static void showList(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void read (Book book, List<Book> tbr, List<Book> hubert) {
        if (tbr.contains(book)) {
            hubert.add(book);
            tbr.remove(book);
        }
    }
}
