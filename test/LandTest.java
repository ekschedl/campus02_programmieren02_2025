import V_Land.Bundesstaat;
import V_Land.Land;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LandTest {

    private Bundesstaat bund; // Instanzvariable für alle Testmethoden

    @Before
    public void vorher() {
        bund = new Bundesstaat();
        bund.addLand(new Land(1000.0));
        bund.addLand(new Land(2000.0));
        bund.addLand(new Land(500.0));
    }

    @Test
    public void testGetBruttoSozialProdukt() {
        double erwartet = 3500.0;
        double ergebnis = bund.getBruttoSozialProdukt();

        Assert.assertEquals(erwartet, ergebnis, 0.01); // 0.01 = Toleranz für Double-Werte
    }
}