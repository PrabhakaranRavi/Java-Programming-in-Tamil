import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File exist = new File(
                    "D://Java-Programming-in-Tamil//Java Programming - 41  Reading from a File//test.txt");
            Scanner scanner = new Scanner(exist);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
