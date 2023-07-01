public class Static {
    public static void main(String[] args) {
        Players obj = new Players("Virat", "Kohli");
        Players objTwo = new Players("MS", "Dhoni");
    }

}

class Players {
    private String firstName;
    private String lastName;
    private static int total;

    public Players(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        System.out.println(firstName + " " + lastName);
        total++;
        System.out.println("Total num of Fields: " + total);
    }
}