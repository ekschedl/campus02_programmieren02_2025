package u_Musikanten___selbst____2023___PR;

import java.util.Comparator;

public class LautstaerkeComparator implements Comparator<Musikant> {

    //Gut, wenn man später noch mehr Kriterien anhängen möchte (z. B. Name vergleichen bei gleicher Lautstärke).
    @Override
    public int compare(Musikant o1, Musikant o2) {
        int cmp = Double.compare(o1.spieleMusik(), o2.spieleMusik());
        if (cmp != 0) {
            return cmp * -1;
        }
        return 0;
    }
//    beide möglichkeiten ok weil bei double automatisch absteigend

//    public int compare(Musikant o1, Musikant o2) {
//    return cmp=Double.compare(o1.spieleMusik(),o2.spieleMusik());
//}
}
