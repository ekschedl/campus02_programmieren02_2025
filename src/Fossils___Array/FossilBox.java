package Fossils___Array;


public class FossilBox {
    Fossil[] fossilBoxContents;

    public FossilBox() {
        this.fossilBoxContents = new Fossil[10];
    }

    public void putFossil(Fossil fossil) {
        for (int i = 0; i < this.fossilBoxContents.length; i++) {
            if (this.fossilBoxContents[i] == null) {
                this.fossilBoxContents[i] = fossil;
                break;
            }
        }
    }

    public void printContents() {
        for (Fossil fossil: this.fossilBoxContents) {
            System.out.println(fossil);
        }
    }
}
