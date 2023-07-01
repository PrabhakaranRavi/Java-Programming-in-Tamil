class Humans {
    public void printName() {
        System.out.println("Printing a name: ");
    }
}

class Dhoni extends Humans {
    public void printName() {
        System.out.println("Printing name is -> Dhoni");
    }
}

class Kohli extends Humans {

}

public class Main {
    public static void main(String[] args) {
        // Dhoni obj = new Dhoni();
        // obj.printName();

        // Kohli objTwo = new Kohli();
        // objTwo.printName();

        // Polymorphism -> You wonot have to use class name for their individual , You
        // can inherit parent level Class
        Humans obj = new Dhoni();
        obj.printName();

        Humans objTwo = new Kohli();
        objTwo.printName();

    }
}
