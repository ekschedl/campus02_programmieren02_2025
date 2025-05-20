//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package V_Orchester;
public class Main {
    public static void main(String[] args) {
        System.out.println("Orchester starting.");

        Orchester orchester = new Orchester();
        orchester.addInstrument(new Geige(40));
        orchester.addInstrument(new Gitarre(20));
        orchester.addInstrument(new Klarinette(30));
        orchester.addInstrument(new Trompete(100));

        int orchesterLautstaerke = orchester.playAll();
        System.out.println("Das gesamte Orchester ist so laut: " +
                orchesterLautstaerke);
    }
}