package u_Devices;

import java.util.Comparator;

public class DeviceNameComparator implements Comparator<Device> {
    @Override
    public int compare(Device d1, Device d2) {
        return d1.getName().compareToIgnoreCase(d2.getName());
    }
}