public class Eissorte implements Comparable<Eissorte> {
    String Name;
    Double Preis;

    public Eissorte(String name, Double preis) {
        Name = name;
        Preis = preis;
    }

    @Override
    public int compareTo(Eissorte o) {
        int result = this.Name.compareTo(o.Name);
        //zuerst nach name, dann nach Preis sortieren
        if (result == 0) {
            return this.Preis.compareTo(o.Preis);
        } else {
            return result;
        }
    }

    @Override
    public String toString() {
        return "Eissorte{" +
                "Name='" + Name + '\'' +
                ", Preis=" + Preis +
                '}';
    }
}
