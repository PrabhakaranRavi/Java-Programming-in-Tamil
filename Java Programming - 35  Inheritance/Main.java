class player {
    public void printName() {
        System.out.println("Printing a Name: ");
    }
}

class Dhoni extends player {
    // When complier looking for the method in class , it gives first perference to
    // the class then only it goes to looks inherit classes.
    // public void printName() {
    // System.out.println("Printing Dhoni ...");
    // }

}

public class Main {
    public static void main(String[] args) {
        player obj = new player();
        obj.printName();
        Dhoni objTwo = new Dhoni();
        objTwo.printName();
    }
}
