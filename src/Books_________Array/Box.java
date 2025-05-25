package Books_________Array;



public class Box {
    Book[] bookBoxContents;

    public Box() {
        this.bookBoxContents = new Book[10];
    }

    public void putBook(Book book) {
        for (int i = 0; i < this.bookBoxContents.length; i++) {
            if (this.bookBoxContents[i] == null) {
                this.bookBoxContents[i] = book;
                break;
            } else {
                System.out.println("notGeneric.Box full, please create new one.");
            }
        }
    }

    public void printContents() {
        for (Book book: this.bookBoxContents) {
            System.out.println(book);
        }
    }
}