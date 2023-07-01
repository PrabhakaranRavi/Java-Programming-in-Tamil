import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x / y);
            scanner.close();
        } catch (Exception e) {
            System.out.println("Number 2 can't be Zero !!!");
        }
    }
}
