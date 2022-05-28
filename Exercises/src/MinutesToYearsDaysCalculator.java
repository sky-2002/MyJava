public class MinutesToYearsDaysCalculator {
    private static String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void printYearsAndDays(long minutes){
        if (minutes<0)
            System.out.println(INVALID_VALUE_MESSAGE);
        else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remaining_days = days % 365;
            System.out.println(minutes + " min" + " = " + years + " y and " + remaining_days + " d");
        }
    }
}
