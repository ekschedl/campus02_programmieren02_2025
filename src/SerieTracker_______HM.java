import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SerieTracker_______HM {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> seriesTracker = new HashMap<>();

        ArrayList<String> romanceSeries = new ArrayList<>();
        romanceSeries.add("You");
        romanceSeries.add("How I met your mother");
        romanceSeries.add("Game of Thrones");

        ArrayList<String> crimeSeries = new ArrayList<>();
        crimeSeries.add("Law and Order");
        crimeSeries.add("Dexter");
        crimeSeries.add("Castle");
        crimeSeries.add("Sherlock Holmes");
        crimeSeries.add("Slow Horses");
        crimeSeries.add("Tatort");
        crimeSeries.add("Kommissar Rex");
        crimeSeries.add("CSS");

        ArrayList<String> comedySeries = new ArrayList<>();
        comedySeries.add("Scrubs");
        comedySeries.add("Two broke girls");
        comedySeries.add("Brooklyn 99");
        comedySeries.add("The Big Bang Theory");
        comedySeries.add("Community");
        comedySeries.add("The good place");

        seriesTracker.put("Romance", romanceSeries);
        seriesTracker.put("Comedy", comedySeries);
        seriesTracker.put("Crime", crimeSeries);

        // Find watch ideas for one Genre
        //option 1
        for (Map.Entry<String, ArrayList<String>> entry : seriesTracker.entrySet()) {
            if (entry.getKey().equals("Comedy")) {
                System.out.println(entry.getKey() + " contains the series: " + entry.getValue());
            }
        }
        System.out.println("-------------------------");

        //option 2
        for (Map.Entry<String, ArrayList<String>> entry : seriesTracker.entrySet()) {
            System.out.println("Watch ideas for " + entry.getKey() + ": ");
            for (String series : entry.getValue()) {
                System.out.println(series);
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        // Option 3
        String seriesToBeSearched = "Comedy";
        if (seriesTracker.containsKey(seriesToBeSearched)) {
            System.out.println("Watch ideas for " + seriesToBeSearched + seriesTracker.get(seriesToBeSearched));
        }
    }
}
