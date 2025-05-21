import Eissorten_Junit___C_T.ComparatorPriceDESC;
import Eissorten_Junit___C_T.Eissalon;
import Eissorten_Junit___C_T.Eissorte;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Eissortierungstest {

    List<Eissorte> list = new LinkedList<>();

    @Before
    public void vorher() {
        Eissalon salon = new Eissalon();
        list = salon.list;
    }

    @Test
    public void sortB() {
        //Sortieren
        Collections.sort(list, new ComparatorPriceDESC());
        System.out.println(list.get(0));

        Assert.assertEquals("Vanille", list.get(0).Name);
        Assert.assertEquals((Double) 1.0d, (Double) list.get(0).Preis);
    }
}
