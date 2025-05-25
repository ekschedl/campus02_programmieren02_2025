package u_Musikanten___selbst____2023___PR;
import java.util.Comparator;

public class LautstaerkenComparator implements Comparator<Musikant> {

    //Absolut gleichwertig – aber nicht erweiterbar, falls du zusätzliche Kriterien brauchst
    @Override
    public int compare(Musikant o1, Musikant o2) {
        return (Double.compare(o1.spieleMusik(),o2.spieleMusik()))*-1;
    }
}
