package AgeCalculator___E;

public class AgeCalculator {
    //Constants
    public final int DAYS_IN_A_YEAR = 365;
    public final int WEEKS_IN_A_YEAR = 52;
    public final int MONTHS_IN_A_YEAR = 12;

    public double ageInDays(int age_in_years) {
        return age_in_years * DAYS_IN_A_YEAR;
    }

    public double ageInWeeks(int age_in_years) {
        return age_in_years * WEEKS_IN_A_YEAR;
    }

    public double ageInMonths(int age_in_years) {
        return age_in_years * MONTHS_IN_A_YEAR;
    }
}