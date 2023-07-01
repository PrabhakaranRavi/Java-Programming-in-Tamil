abstract class Humans {
    public abstract void printName();

}

class Dhoni extends Humans {
    public void printName() {
        System.out.println("Printing name is -> Dhoni");
    }
}

class Kohli extends Humans {
    public void printName() {
        System.out.println("Printing name is -> Kohli");
    }
}

public class Main {
    public static void main(String[] args) {
        Humans obj = new Dhoni();
        obj.printName();

        Humans objTwo = new Kohli();
        objTwo.printName();

    }
}
