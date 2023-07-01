enum day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private day() {
        System.out.println("Constructor called .");
    }
}

public class Main {
    public static void main(String[] args) {
        day dayObj = day.THURSDAY;
        switch (dayObj) {
            case SUNDAY:
                System.out.println("It is a Holiday !!!");
                break;
            case MONDAY:
                System.out.println("It is Monday !!!");
                break;
            case TUESDAY:
                System.out.println("It is Tuesday !!!");
                break;
            case WEDNESDAY:
                System.out.println("It is Wednesday !!!");
                break;
            case THURSDAY:
                System.out.println("It is Thursday !!!");
                break;
            case FRIDAY:
                System.out.println("It is Friday !!!");
                break;
            case SATURDAY:
                System.out.println("It is Saturday !!!");
                break;
        }
    }
}
