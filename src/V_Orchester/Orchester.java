package V_Orchester;

import java.util.ArrayList;
import java.util.List;


public class Orchester {
    List<Instrument> myInstruments = new ArrayList<Instrument>();

    public void addInstrument(Instrument instrument) {
        myInstruments.add(instrument);
    }

    public int playAll(){
        int summe = 0;
        for(Instrument i : myInstruments)
        {
            summe = summe + i.play();
        }
        return summe;
    }
}
