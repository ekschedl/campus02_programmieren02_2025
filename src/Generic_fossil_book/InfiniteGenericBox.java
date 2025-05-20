package Generic_fossil_book;



import java.util.ArrayList;

public class InfiniteGenericBox<T> {
    private ArrayList<T> contents;

    public InfiniteGenericBox() {
        contents = new ArrayList<>();
    }

    public void putItem(T item) {
        contents.add(item);
    }

    public void printContents() {
        for (T item: contents) {
            System.out.println(item);
        }
    }
}
