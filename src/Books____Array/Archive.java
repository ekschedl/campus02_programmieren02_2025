package Books____Array;

public class Archive {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", "JK Rowling", "isbn123");

        Box box = new Box();

        box.putBook(book);
        box.printContents();
    }
}
