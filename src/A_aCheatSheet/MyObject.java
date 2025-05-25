package A_aCheatSheet;

public class MyObject {

    //JUST DUMMY ATTRIBUTES
    int oKey;
    String oValue;

    Day_Enum_CheatSheet day;

    public MyObject(int oKey, String oValue) {
        this.oKey = oKey;
        this.oValue = oValue;
    }

    public MyObject(Integer hashKey, String hashValue) {
        this.oKey = hashKey;
        this.oValue = hashValue;
    }

    public MyObject(String hashValue, int hashHey) {
        this.oValue = hashValue;
        this.oKey = hashHey;
    }

    public Day_Enum_CheatSheet getDay() {
        return day;
    }

    public void setDay(Day_Enum_CheatSheet day) {
        this.day = day;
    }

    //JUST DUMMY METHODS
    public int valueYouAreSearchingFor() {
        return 1 + 1;
    }

    public String getoValue() {
        return oValue;
    }

    public int getoKey() {
        return oKey;
    }

    public void setHashHey(int hashHey) {
        this.oKey = oKey;
    }

}
