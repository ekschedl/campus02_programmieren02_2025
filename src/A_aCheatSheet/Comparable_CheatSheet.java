package A_aCheatSheet;

//DONT FORGET THE KEYWORD "IMPLEMENTS" COMPARABLE<CLASS/OBJECT NAME>
public class Comparable_CheatSheet implements Comparable<Comparable_CheatSheet> {
    //JUST DUMMY ATTRIBUTES
    Integer oKey2;  //NOTE: COMPARABLE JUST WORKS WITH WRAPPER CLASS TYPE (INTEGER, DOUBLE, STRING, ETC). NO0000 PRIMITIVE DATA TYPES (int, boolean, char) !!!!!
    String oValue2;

    Day_Enum_CheatSheet day;
    public Comparable_CheatSheet(int oKey2, String oValue2) {
        this.oKey2 = oKey2;
        this.oValue2 = oValue2;
    }


    //THIS METHOD MUST BE PRESENT IN THE CLASS/OBJECT YOU WANT TO COMPARE!!!!!
    @Override
    public int compareTo(Comparable_CheatSheet o) {
        int result = this.oKey2.compareTo(o.oKey2); // first criteria
        if (result == 0) {
            result = this.oValue2.compareTo(o.oValue2); //second criteria
        }
        return result;
    }


    /*------- MAYBE A BETTER METHOD----------------------------------------------
        public int compareTo(MyObject o) {
        if (this.age < o.age) {
            return -1;
        }
        if (this.age > o.age) {
            return 1;
        }

        //if MyObjects  have same age, sort by another value
        if (this.anotherValue < o.anotherValue) {
            return -1;
        }
        if (this.nrCarrots > o.nrCarrots) {
            return 1;
        }
        return 0;

        //for int comparison use:
        //Integer.compare (2,4);
        //return Integer.compare(this.age, o.age)
        //for Strings comparison use:
        //String s = "Hansi"
        //return s.compareTo("Hansi");
    }
     */



    public Integer getoKey2() {
        return oKey2;
    }

    public String getoValue2() {
        return oValue2;
    }

    @Override
    public String toString() {
        return "Object: " + getClass().getName() + "  " + getoKey2() + getoValue2() +
                " : ";
    }

}
