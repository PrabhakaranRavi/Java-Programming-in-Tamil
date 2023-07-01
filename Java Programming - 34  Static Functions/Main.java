import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        Player obj = new Player("MS", "Dhoni");
        System.out.println(obj.playerFirstName());
        System.out.println(Player.numOfPlyerInTheField());
        Player objThala = new Player("Thala", "Dhoni");
        System.out.println(Player.numOfPlyerInTheField());

        // Point 1: You canot use private variables in the static Function
    }
}

class Player {
    private String FirstName;
    private String LastName;
    private static int total;

    public Player(String fName, String lName) {
        FirstName = fName;
        LastName = lName;
        total++;
        System.out.println("Player name: " + FirstName + LastName + "\nTotal player in the field: " + total);
    }

    public String playerFirstName() {
        return FirstName;
    }

    public static int numOfPlyerInTheField() {
        return total;
    }

    // Cannot make a static reference to the non-static field FirstName
    // public static String errorForPublicVariable(){
    // return FirstName;
    // }
    // You can use Static variable in the normal methods
    public int numPlayerCheckingStaticVariable() {
        return total;
    }
}