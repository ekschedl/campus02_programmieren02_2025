package Fossils___Array;

public class Fossil_main {
    public static void main(String[] args) {
    Fossil fossil = new Fossil("Diplodocus", 145000000, false);
    Fossil fossil2 = new Fossil("Brachiosaurus", 179000000, false);
    FossilBox fossilBox = new FossilBox();
        fossilBox.putFossil(fossil);
        fossilBox.putFossil(fossil2);
        fossilBox.printContents();


}}
