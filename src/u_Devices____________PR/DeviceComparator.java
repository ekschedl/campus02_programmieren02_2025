package u_Devices____________PR;

import java.util.Comparator;

public class DeviceComparator implements Comparator<Device> {

    @Override
    public int compare(Device d1, Device d2) {
        // Sortiere nach Produktionskosten (aufsteigend)
        return Double.compare(d1.calculateProductionCost(), d2.calculateProductionCost());
    }
}
