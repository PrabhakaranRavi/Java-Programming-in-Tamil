import java.io.File;

public class Main {
    public static void main(String[] args) {
        File exist = new File("D://Java-Programming-in-Tamil//Java Programming - 39  File Handling//test.txt");
        if (exist.exists()) {
            System.out.println("File is exist.");
        } else {
            System.out.println("File doesnot exist.");
        }
    }
}
