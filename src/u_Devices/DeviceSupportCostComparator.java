package u_Devices;

import java.util.Comparator;

public class DeviceSupportCostComparator implements Comparator<Device> {
    private int year;  // Jahr als Vergleichsbasis

    public DeviceSupportCostComparator(int year) {
        this.year = year; // Konstruktor speichert Jahr in Objekt
    }

    @Override
    public int compare(Device d1, Device d2) {
        return Double.compare(d1.calculateSupportCostForAYear(year),
                d2.calculateSupportCostForAYear(year));
    }
}
