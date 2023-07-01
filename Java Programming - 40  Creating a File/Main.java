import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File exist = new File("D://Java-Programming-in-Tamil//Java Programming - 40  Creating a File//test.txt");
            if (exist.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already there.");
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
