import java.util.EnumSet;

enum day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Main {
    public static void main(String[] args) {
        // To print all the constants in Enumneration/Enum
        for (day obj : day.values()) {
            System.out.println(obj);
        }
        System.out.println();
        // To print constants by using Enumset Range
        for (day obj : EnumSet.range(day.TUESDAY, day.THURSDAY)) {
            System.out.println(obj);
        }
    }
}
