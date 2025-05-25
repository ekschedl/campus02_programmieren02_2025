package Fahrzeug______V_C_T;

public class UngueltigePsException extends Exception {
    public UngueltigePsException(String msg) {
        super(msg);
        System.out.println("UngueltigePsException ausgelöst!");
    }
}