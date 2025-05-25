import org.junit.Before;
import org.junit.Test;
import u_Devices____________PR.*;

import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DeviceTest {
    private Tablet t1, t2;
    private Smartwatch w1, w2;
    private Smartphone s1, s2;
    private Processor c1, c2, c3, c4;
    private DeviceDatabase db;

    @Before
    public void setup() {

        c1 = new Processor("A11", 1, 2);
        c2 = new Processor("A12", 2, 2);
        c3 = new Processor("A12", 2, 6);
        c4 = new Processor("A13", 3, 4);

        s1 = new Smartphone("s1", c1, 2019, 100000, 2);
        s2 = new Smartphone("s2", c3, 2021, 1000000, 3);

        w1 = new Smartwatch("w1", c2, 2020, 1000, 2);
        w2 = new Smartwatch("w2", c3, 2021, 100, 3);

        t1 = new Tablet("t1", c2, 2020, 1000, 30);
        t2 = new Tablet("t2", c4, 2021, 10000, 2);
        db = new DeviceDatabase();

        db.addDevice(s1);
        db.addDevice(s2);
        db.addDevice(t1);
        db.addDevice(t2);
        db.addDevice(w1);
        db.addDevice(w2);

        System.out.println("Alle Geräte in der Datenbank:");
        for (Device d : db.getDevices()) {
            System.out.println(d.getName() + " | Gen: " + d.getProcessor().getGeneration() + " | Cores: " + d.getProcessor().getNrCores());
        }
    }

    @Test
    public void testConstructor() {
        assertEquals("t1", t1.getName());
        assertEquals(c2, t1.getProcessor());
        assertEquals(2020, t1.getReleaseYear());
        assertEquals(1000, t1.getNrProduced());
        assertEquals(30, t1.getArCameras());

        assertEquals("s1", s1.getName());
        assertEquals(c1, s1.getProcessor());
        assertEquals(2019, s1.getReleaseYear());
        assertEquals(100000, s1.getNrProduced());
        assertEquals(2, s1.getNrCameras());

        assertEquals("w1", w1.getName());
        assertEquals(c2, w1.getProcessor());
        assertEquals(2020, w1.getReleaseYear());
        assertEquals(1000, w1.getNrProduced());
        assertEquals(2, w1.getNrWristSize());
    }

    //sum = 1 * 100 + 20 = 120
//productionCost = 100000 * 120 = 12_000_000
    @Test
    public void testProductionCost() {
        assertEquals(12000000, s1.calculateProductionCost(), 0.001);
        assertEquals(22000000, s2.calculateProductionCost(), 0.001);
        assertEquals(110000, w1.calculateProductionCost(), 0.001);
        assertEquals(12000, w2.calculateProductionCost(), 0.001);
        assertEquals(1850000, t1.calculateProductionCost(), 0.001);
        assertEquals(8000000, t2.calculateProductionCost(), 0.001);
    }

    @Test
    public void testSupportCost() {
        assertEquals(4000000, s1.calculateSupportCostForAYear(2021), 0.001);
        assertEquals(0, s2.calculateSupportCostForAYear(2021), 0.001);
        assertEquals(20000, w1.calculateSupportCostForAYear(2021), 0.001);
        assertEquals(6000, w2.calculateSupportCostForAYear(2021), 0.001);
        assertEquals(49900, t1.calculateSupportCostForAYear(2021), 0.001); //Release 2020 → Jahr 2021 = 1 Jahr späterPreis = 50 - 0.10 = 49.90→ 49.90 * 1000 = 49900
        assertEquals(500000, t2.calculateSupportCostForAYear(2021), 0.001);

    }
    @Test
    public void testDeviceDatabase() {


        assertEquals(43972000, db.calculateSumOfProductionCosts(), 0.001);

        assertEquals(w2, db.findeDeviceWithCheapestProductionCost());

        assertEquals(4000000, db.calculateSupportCostUntilYear(s1, 2021), 0.001);        assertEquals(0, db.calculateSupportCostUntilYear(s2,2021), 0.001);
        assertEquals(0, db.calculateSupportCostUntilYear(s2,2017), 0.001);

        assertEquals(s1, db.findDeviceWithHighestSupportCost(2021));


        HashMap<Integer, Integer> min = new HashMap<>();
        min.put(2,4);
        min.put(3,2);
        List<Device> d = db.findDevicesThatFullfillMinimumPerformance(min);
        assertEquals(3, d.size());
        assertTrue(d.contains(s2));
        assertTrue(d.contains(w2));
        assertTrue(d.contains(t2));



    }
}
