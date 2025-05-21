package FieldOfStudy___E;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        Double wrappedDouble = 3.0;
        Integer wrappedInt = 1;
        double d = 1d;
//        double d1 = 8d;

        System.out.println(i);
        System.out.println(wrappedInt);
        System.out.println(d);
        System.out.println(wrappedDouble);

        //autoboxing
        Integer wrappingInt = i;
        System.out.println(wrappingInt);

        //autoUnboxing
        int unwrapped = wrappingInt;


    }
}

