package Generic_fossil_book;

public class GenericArchive {
    public static void main(String[] args) {
//        Book book = new Book("title", "author", "isbn12");
//        Fossil fossil = new Fossil("fossil", 123000000, true);
//        GenericBox<Book> bookBox = new GenericBox<>();
//
//        bookBox.putItem(book);
//        bookBox.printContents();
//
//        GenericBox<Fossil> fossilBox = new GenericBox<>();
//        fossilBox.putItem(fossil);
//        fossilBox.printContents();
//
//        GenericBox<Integer> integerBox = new GenericBox<>();
//        integerBox.putItem(12);
//        integerBox.putItem(1);
//        integerBox.putItem(132);
//        integerBox.putItem(1200);
//        integerBox.putItem(9008);
//        integerBox.putItem(123456);
//        integerBox.putItem(1294848);
//        integerBox.printContents();
//
//
//        Printer<Book> bookPrinter = new Printer<>();
//        bookPrinter.print(book);
//
//        Printer<Double> doublePrinter = new Printer<>();
//        doublePrinter.print(1.2);
//        doublePrinter.print(1.9);
//        doublePrinter.print(2d);
//        doublePrinter.print(200.99);
//        doublePrinter.print(190d);
//        doublePrinter.print(1d);

        InfiniteGenericBox<Integer> infiniteGenericBox = new InfiniteGenericBox<>();
        infiniteGenericBox.putItem(12);

        infiniteGenericBox.printContents();
    }
}
